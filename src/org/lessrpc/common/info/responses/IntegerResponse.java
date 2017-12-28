package org.lessrpc.common.info.responses;

public class IntegerResponse extends RequestResponse<Integer> {

	private Integer content;

	public IntegerResponse(int status, int content) {
		this.status = status;
		this.content = content;
	}

	public IntegerResponse() {
	}

	@Override
	public Integer getContent() {
		return content;
	}

	@Override
	public void setContent(Integer content) {
		this.content = content;
	}

}
