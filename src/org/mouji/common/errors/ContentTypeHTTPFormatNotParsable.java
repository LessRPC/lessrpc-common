package org.mouji.common.errors;

public class ContentTypeHTTPFormatNotParsable extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContentTypeHTTPFormatNotParsable(String txt) {
		super("ContentType http syntax not parsable = \"" + txt + "\"");
	}

}
