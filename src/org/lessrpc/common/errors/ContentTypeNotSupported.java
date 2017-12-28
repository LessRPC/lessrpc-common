package org.lessrpc.common.errors;


import org.lessrpc.common.info.SerializationFormat;

public class ContentTypeNotSupported extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContentTypeNotSupported(SerializationFormat format) {
		super("ContentType not supported: " + format.httpFormat());
	}

}
