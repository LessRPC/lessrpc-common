package org.mouji.common.errors;

public class AcceptTypeHTTPFormatNotParsable extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AcceptTypeHTTPFormatNotParsable(String txt) {
		super("AcceptType http syntax not parsable = \"" + txt + "\"");
	}

}
