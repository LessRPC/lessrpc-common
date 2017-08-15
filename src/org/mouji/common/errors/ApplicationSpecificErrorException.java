package org.mouji.common.errors;

public class ApplicationSpecificErrorException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String content;
	private int errorCode;

	public ApplicationSpecificErrorException(int errorCode, String content) {
		super(content);
		this.setErrorCode(errorCode);
		this.setContent(content);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
