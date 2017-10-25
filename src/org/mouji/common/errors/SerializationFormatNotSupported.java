package org.mouji.common.errors;


import org.mouji.common.info.SerializationFormat;

public class SerializationFormatNotSupported extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SerializationFormatNotSupported(SerializationFormat format) {
		super("SerializationFormat not supported: " + format.httpFormat());
	}

}
