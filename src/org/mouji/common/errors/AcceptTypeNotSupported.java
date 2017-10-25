package org.mouji.common.errors;


import org.mouji.common.info.SerializationFormat;

public class AcceptTypeNotSupported extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AcceptTypeNotSupported(SerializationFormat format) {
		super("AcceptType not supported: " + format.httpFormat());
	}

}
