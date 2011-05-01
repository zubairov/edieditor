/*
 * Milyn - Copyright (C) 2006 - 2011
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License (version 2.1) as published by the Free Software
 * Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * See the GNU Lesser General Public License for more details:
 * http://www.gnu.org/licenses/lgpl.txt
 */
package org.smooks.edi.editor.resource;

import javax.xml.XMLConstants;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * Special {@link XMLFilter} implementation that will filter
 * out all attributes from {@link XMLConstants#XMLNS_ATTRIBUTE_NS_URI} namespace
 * because of the issue with parsing these in EMF
 * 
 * @author zubairov
 *
 */
public class EDIXMLFilter extends XMLFilterImpl {

	public EDIXMLFilter(XMLReader parser) {
		super(parser);
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		AttributesImpl newAttrs = new AttributesImpl();
		for (int i = 0; i < atts.getLength(); i++) {
			if (!XMLConstants.XMLNS_ATTRIBUTE_NS_URI.equals(atts.getURI(i))) {
				newAttrs.addAttribute(atts.getURI(i), atts.getLocalName(i), atts.getQName(i), atts.getType(i), atts.getValue(i));
			}
		}
		super.startElement(uri, localName, qName, newAttrs);
	}
	
}
