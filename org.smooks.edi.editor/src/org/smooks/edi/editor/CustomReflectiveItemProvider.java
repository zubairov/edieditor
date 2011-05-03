package org.smooks.edi.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.milyn.ect.ecore.SmooksMetadata;

/**
 * Extension for the {@link ReflectiveItemProvider} to change
 * {@link ILabelProvider} implementation
 * 
 * @author zubairov
 * 
 */
public class CustomReflectiveItemProvider extends ReflectiveItemProvider {

	private static final int ELLIPSE_LENGTH = 30;
	protected final SmooksMetadata metadata = SmooksMetadata.INSTANCE;
	
	public CustomReflectiveItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		EObject eObject = (EObject) object;
		EClass eClass = eObject.eClass();
		String label = format(capName(eClass.getName()), ' ');
		EStructuralFeature feature = eObject.eContainingFeature();
		if (feature != null) {
			if (metadata.isSegment(feature)) {
				return metadata.getSegcode(feature) + " {" + label + "}";
			}
			if (metadata.isSegmentGroup(feature)) {
				return label + " {" + ellipse(getSegmentGroupDescription(eClass)) + "}";
			}
			if (metadata.isField(feature) && eClass.getName().indexOf('_') > 0) {
				String name = eClass.getName();
				String refID = name.substring(name.lastIndexOf('_') + 1, name.length());
				name = name.substring(0, name.lastIndexOf('_'));
				return format(name, ' ') + " {" + refID + "}"; 
			}
		}
		return super.getText(object);
	}

	/**
	 * Cut too long strings
	 * 
	 * @param segmentGroupDescription
	 * @return
	 */
	private String ellipse(String str) {
		if (str.length() >= ELLIPSE_LENGTH) {
			int firstSpace = str.indexOf(' ', ELLIPSE_LENGTH - 7);
			return str.substring(0, firstSpace - 1) + " ... " + str.substring(str.lastIndexOf(' ') + 1, str.length());
		}
		return str;
	}

	private String getSegmentGroupDescription(EClass eClass) {
		StringBuilder result = new StringBuilder();
		EList<EStructuralFeature> eStructuralFeatures = eClass.getEStructuralFeatures();
		for (EStructuralFeature feature : eStructuralFeatures) {
			if (result.length() > 0) {
				result.append(" ");
			}
			if (metadata.isSegment(feature)) {
				String segment = metadata.getSegcode(feature);
				if (segment != null) {
					result.append(segment);
					result.append(getCardinalitySign(feature));
				}
			} else if (metadata.isSegmentGroup(feature) && (feature.getEType() instanceof EClass)) {
				result.append(getSegmentGroupDescription((EClass) feature.getEType()));
			}
		}
		return result.toString();
	}

	/**
	 * Returns * ? or + depending on feature cardinality
	 * 
	 * @param feature
	 * @return
	 */
	private Object getCardinalitySign(EStructuralFeature feature) {
		if (feature.isRequired()) {
			return feature.isMany()?"+":"";
		} else {
			return feature.isMany()?"*":"?";
		}
	}

}
