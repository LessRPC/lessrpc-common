package me.salimm.jrns.common.info;

import me.salimm.jrns.common.types.StubEnvType;

public class ClientInfo {

	/**
	 * language of the client stub
	 */
	private StubEnvType stubType;

	private String url;

	public ClientInfo() {
		// Dummy Constructor for use of RPC
	}

	public ClientInfo(String url, StubEnvType type) {
		this.url = url;
		stubType = type;
	}

	public StubEnvType getStubType() {
		return stubType;
	}

	public void setStubType(StubEnvType stubType) {
		this.stubType = stubType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ClientInfo stubType: "+stubType+",  url:'"+url+"'}";
	}

}
