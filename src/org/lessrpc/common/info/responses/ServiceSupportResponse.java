package org.lessrpc.common.info.responses;

import org.lessrpc.common.info.ServiceSupportInfo;

public class ServiceSupportResponse extends RequestResponse<ServiceSupportInfo> {

	private ServiceSupportInfo content;

	public ServiceSupportResponse(int status, ServiceSupportInfo content) {
		this.status = status;
		this.content = content;
	}

	public ServiceSupportResponse() {
	}

	@Override
	public ServiceSupportInfo getContent() {
		return content;
	}

	@Override
	public void setContent(ServiceSupportInfo content) {
		this.content = content;
	}

}
