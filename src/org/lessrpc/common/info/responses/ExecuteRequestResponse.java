package org.lessrpc.common.info.responses;


public class ExecuteRequestResponse<T> extends RequestResponse<ServiceResponse<T>> {

	private ServiceResponse<T> content;

	public ExecuteRequestResponse(int status, ServiceResponse<T> content) {
		this.status = status;
		this.content = content;
	}

	public ExecuteRequestResponse() {
	}

	@Override
	public ServiceResponse<T> getContent() {
		return content;
	}

	@Override
	public void setContent(ServiceResponse<T> content) {
		this.content = content;
	}

}
