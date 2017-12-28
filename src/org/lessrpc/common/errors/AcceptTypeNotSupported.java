package org.lessrpc.common.errors;


import org.lessrpc.common.info.SerializationFormat;

public class AcceptTypeNotSupported extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AcceptTypeNotSupported(SerializationFormat format) {
		super("AcceptType not supported: " + format.httpFormat());
	}

}
