package org.mouji.common.errors;


import org.mouji.common.info.SerializationFormat;

public class ContentTypeNotSupported extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContentTypeNotSupported(SerializationFormat format) {
		super("ContentType not supported: " + format.httpFormat());
	}

}
