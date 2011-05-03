package org.smooks.edi.editor.resource;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.milyn.edisax.EDIParser;
import org.milyn.edisax.unedifact.UNEdifactInterchangeParser;
import org.xml.sax.SAXException;

/**
 * Custom XML Load
 * 
 * @author zubairov
 *
 */
public class EDIXMLLoad extends XMLLoadImpl implements XMLLoad {

	private Registry reg;

	public EDIXMLLoad(XMLHelper helper, Registry registry) {
		super(helper);
		this.reg = registry;
	}

	@Override
	protected SAXParser makeParser() throws ParserConfigurationException,
			SAXException {
		UNEdifactInterchangeParser parser = new UNEdifactInterchangeParser();
		parser.setMappingsRegistry(new EclipseMappingsRegistry(reg));
		if (options.containsKey(EDIParser.FEATURE_IGNORE_NEWLINES)) {
			parser.setFeature(EDIParser.FEATURE_IGNORE_NEWLINES, (Boolean) options.get(EDIParser.FEATURE_IGNORE_NEWLINES));
		}
		if (options.containsKey(EDIParser.FEATURE_VALIDATE)) {
			parser.setFeature(EDIParser.FEATURE_VALIDATE, (Boolean) options.get(EDIParser.FEATURE_VALIDATE));
		}
		return new EDISAXParser(parser);
	}
	
}
