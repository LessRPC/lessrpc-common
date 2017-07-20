package me.salimm.jrns.common.info;

import me.salimm.jrns.common.types.StubEnvType;

public class ClientInfo {

	/**
	 * language of the client stub
	 */
	private StubEnvType stubType;
	
	private String url;
	
	private int port;
	
	public ClientInfo(String url, int port, StubEnvType type) {
		this.url = url;
		this.port = port;
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

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
