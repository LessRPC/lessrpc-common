package org.mouji.common.info.responses;

public abstract class RequestResponse<T> {

	
	protected int status;
	

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public abstract T getContent();
	
	public abstract void setContent(T content);
	
}
