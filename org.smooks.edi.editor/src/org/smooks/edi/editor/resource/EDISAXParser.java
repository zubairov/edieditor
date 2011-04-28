package org.smooks.edi.editor.resource;

import javax.xml.parsers.SAXParser;

import org.milyn.edisax.EDIParser;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/**
 * A special implementation of {@link SAXParser} that uses {@link EDIParser} as
 * {@link XMLReader}
 * 
 * @author zubairov
 */
@SuppressWarnings("deprecation")
public class EDISAXParser extends SAXParser {

	protected final XMLReader parser;

	/**
	 * Constructor
	 * 
	 * @param parser
	 */
	public EDISAXParser(XMLReader parser) {
		this.parser = parser;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Parser getParser() throws SAXException {
		throw new UnsupportedOperationException("Deprecated operation, shouldn't be used");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object getProperty(String name) throws SAXNotRecognizedException,
			SAXNotSupportedException {
		throw new SAXNotRecognizedException("No properties are supported by EDISAXParser");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XMLReader getXMLReader() throws SAXException {
		return parser;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isNamespaceAware() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isValidating() {
		try {
			return parser.getFeature(EDIParser.FEATURE_VALIDATE);
		} catch (Exception e) {
			// ignored
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setProperty(String arg0, Object arg1)
			throws SAXNotRecognizedException, SAXNotSupportedException {
		throw new SAXNotRecognizedException("No properties are supported by EDISAXParser");
	}

}
