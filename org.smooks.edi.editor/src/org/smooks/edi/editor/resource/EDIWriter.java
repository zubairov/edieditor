package org.smooks.edi.editor.resource;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.milyn.ect.ecore.SmooksMetadata;
import org.milyn.edisax.model.internal.Delimiters;
import org.milyn.edisax.unedifact.UNEdifactInterchangeParser;

/**
 * Class that would serialize {@link UnEdifactType} to UN/EDIFACT
 * 
 * @author zubairov
 * 
 */
public interface EDIWriter {

	/**
	 * Serialize {@link UnEdifactType} to the EDIFACT
	 * 
	 * @param out
	 * @param interchange
	 * @throws IOException
	 */
	public void write(Writer out, UNEdifact interchange) throws IOException;

	public static final EDIWriter INSTANCE = new EDIWriter() {

		private final SmooksMetadata metadata = SmooksMetadata.INSTANCE;

		/**
		 * {@inheritDoc}
		 */
		public void write(Writer out, UNEdifact interchange) throws IOException {
			Delimiters del = UNEdifactInterchangeParser.defaultUNEdifactDelimiters;
			serializeGroup(interchange, del, out);
		}

		/**
		 * Serializes Segment group
		 * 
		 * @param group
		 * @param del
		 * @param out
		 * @throws IOException
		 */
		@SuppressWarnings("unchecked")
		private void serializeGroup(EObject group, Delimiters del, Writer out)
				throws IOException {
			EClass clazz = group.eClass();
			EList<EStructuralFeature> features = clazz.getEStructuralFeatures();
			for (EStructuralFeature feature : features) {
				if (feature instanceof EReference) {
					boolean isSegment = metadata.isSegment(feature);
					boolean isGroup = metadata.isSegmentGroup(feature);
					if (!(isSegment || isGroup)) {
						throw new IllegalArgumentException(
								"Invalid segment group "
										+ clazz.getName()
										+ ". Segment group could only refer"
										+ " to segments or another segment groups");
					}
					if (group.eIsSet(feature)) {
						Object obj = group.eGet(feature);
						if (obj instanceof Collection<?>) {
							// We have more than one entry
							Collection<EObject> collection = (Collection<EObject>) obj;
							for (EObject object : collection) {
								if (isSegment) {
									String segCode = metadata
											.getSegcode(feature);
									serializeSegment(object, del, out, segCode);
								} else {
									serializeGroup(object, del, out);
								}
							}
						} else {
							// We have only one entry
							if (isSegment) {
								String segCode = metadata.getSegcode(feature);
								serializeSegment((EObject) obj, del, out,
										segCode);
							} else {
								serializeGroup((EObject) obj, del, out);
							}
						}
					}
				} else {
					// We have an attribute
					if (group.eIsSet(feature)) {
						Object obj = group.eGet(feature);
						// Do we have a feature map here?
						if (obj instanceof FeatureMap) {
							FeatureMap map = (FeatureMap) obj;
							EObject childMsg = (EObject) map.getValue(0);
							serializeGroup(childMsg, del, out);
						} else {
							throw new IllegalArgumentException(
									"Unexpected attribute " + feature.getName()
											+ " in " + clazz.getName());
						}
					}
				}
			}
		}

		/**
		 * Serializes individual segment
		 * 
		 * @param obj
		 * @param del
		 * @param out
		 * @throws IOException
		 */
		private void serializeSegment(EObject obj, Delimiters del, Writer out,
				String segCode) throws IOException {
			out.write(segCode);
			out.write(del.getField());
			EClass clazz = obj.eClass();
			EList<EStructuralFeature> features = clazz.getEStructuralFeatures();
			boolean compOut = false;
			for (EStructuralFeature feature : features) {
				if (!metadata.isField(feature)) {
					throw new IllegalArgumentException("Segment "
							+ clazz.getName() + " could only contain fields");
				}
				if (obj.eIsSet(feature)) {
					if (compOut) {
						// TODO Fix required/+ sign issue that non-required
						// fields are
						// not written as filled with empty
						out.write(del.getField());
					}
					serializeField(obj.eGet(feature), del, out);
					compOut = true;
				}
			}
			out.write(del.getSegment());
			// TODO Can we do newline here?
			out.write("\n");
		}

		private void serializeField(Object obj, Delimiters del, Writer out)
				throws IOException {
			if (obj instanceof EObject) {
				seiralizeFieldWithComponents((EObject) obj, del, out);
			} else {
				serializeValue(obj, del, out);
			}
		}

		/**
		 * Serialize complex field that has components
		 * 
		 * @param field
		 * @param del
		 * @param out
		 * @throws IOException
		 */
		private void seiralizeFieldWithComponents(EObject field,
				Delimiters del, Writer out) throws IOException {
			EClass clazz = field.eClass();
			EList<EStructuralFeature> features = clazz.getEStructuralFeatures();
			boolean featureOut = false;
			for (EStructuralFeature feature : features) {
				if (!metadata.isComponent(feature)) {
					throw new IllegalArgumentException("Feature " + feature + " is not a component");
				}
				if (field.eIsSet(feature)) {
					if (featureOut) {
						out.write(del.getComponent());
					}
					Object value = field.eGet(feature);
					serializeValue(value, del, out);
					featureOut = true;
				}
			}
		}

		/**
		 * Serialize simple field
		 * 
		 * @param obj
		 * @param del
		 * @param out
		 * @throws IOException
		 */
		private void serializeValue(Object obj, Delimiters del, Writer out)
				throws IOException {
			out.write(del.escape(String.valueOf(obj)));
		}
	};

}
