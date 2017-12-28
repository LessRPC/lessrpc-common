package org.lessrpc.common.errors;

public class SerializationFormatHTTPNotParsable extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SerializationFormatHTTPNotParsable(String txt) {
		super("SerializationFromat http syntax not parsable = \"" + txt + "\"");
	}

}
