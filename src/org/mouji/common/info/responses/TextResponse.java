package org.mouji.common.info.responses;

public class TextResponse extends RequestResponse<String> {

	private String content;

	public TextResponse(int status, String content) {
		this.status = status;
		this.content = content;
	}

	public TextResponse() {
	}

	@Override
	public String getContent() {
		return content;
	}

	@Override
	public void setContent(String content) {
		this.content = content;
	}

}
