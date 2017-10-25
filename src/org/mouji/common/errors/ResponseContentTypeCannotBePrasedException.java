package org.mouji.common.errors;

public class ResponseContentTypeCannotBePrasedException extends Exception {

	public ResponseContentTypeCannotBePrasedException(String contentType) {
		super("contentType:" + contentType);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
