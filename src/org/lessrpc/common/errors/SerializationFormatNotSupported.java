package org.lessrpc.common.errors;


import org.lessrpc.common.info.SerializationFormat;

public class SerializationFormatNotSupported extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SerializationFormatNotSupported(SerializationFormat format) {
		super("SerializationFormat not supported: " + format.httpFormat());
	}

}
