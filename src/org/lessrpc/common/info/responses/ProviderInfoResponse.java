package org.lessrpc.common.info.responses;

import org.lessrpc.common.info.ServiceProviderInfo;

public class ProviderInfoResponse extends RequestResponse<ServiceProviderInfo> {

	private ServiceProviderInfo content;

	public ProviderInfoResponse(int status, ServiceProviderInfo content) {
		this.status = status;
		this.content = content;
	}

	public ProviderInfoResponse() {
	}

	@Override
	public ServiceProviderInfo getContent() {
		return content;
	}

	@Override
	public void setContent(ServiceProviderInfo content) {
		this.content = content;
	}

}
