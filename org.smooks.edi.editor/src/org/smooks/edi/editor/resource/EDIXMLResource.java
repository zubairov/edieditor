package org.smooks.edi.editor.resource;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.DOMHandler;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.milyn.edisax.unedifact.UNEdifactInterchangeParser;
import org.milyn.edisax.unedifact.registry.MappingsRegistry;
import org.w3c.dom.Document;

/**
 * An extension to {@link XMLResourceImpl} that could be used
 * for parsing
 * 
 * @author zubairov
 *
 */
public class EDIXMLResource extends XMLResourceImpl {

	private MappingsRegistry reg;

	private EDIWriter ediWriter = EDIWriter.INSTANCE;

	public EDIXMLResource() {
		super();
	}
	
	public EDIXMLResource(URI uri, MappingsRegistry reg) {
		super(uri);
		this.reg = reg;
	}
	
	
	@Override
	protected XMLLoad createXMLLoad() {
		return new EDIXMLLoadl(createXMLHelper(), reg);
	}
	
	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		DocumentRoot docRoot = (DocumentRoot) getContents().get(0);
		OutputStreamWriter out = new OutputStreamWriter(outputStream);
		ediWriter.write(out, docRoot.getUnEdifact());
		out.flush();
		outputStream.flush();
	}
	
	@Override
	public void doSave(Writer writer, Map<?, ?> options) throws IOException {
		DocumentRoot docRoot = (DocumentRoot) getContents().get(0);
		ediWriter.write(writer, docRoot.getUnEdifact());
		writer.flush();
	}
	
	@Override
	public Document save(Document doc, Map<?, ?> options, DOMHandler handler) {
		throw new UnsupportedOperationException("Not supported operation!");
	}

}
