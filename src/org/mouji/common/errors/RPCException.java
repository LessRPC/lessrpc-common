package org.mouji.common.errors;

import org.mouji.common.types.StatusType;

public class RPCException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private StatusType status;

	private String content;

	public RPCException(int status, String content) {
		this.status = StatusType.fromCode(status);
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStatusCode() throws UnderterminableCodeException {
		return status.toCode();
	}

	public void setStatus(int status) {
		this.status = StatusType.fromCode(status);
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public StatusType getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "{RPCException  status: +" + status + " , content" + content + "}";
	}

}
