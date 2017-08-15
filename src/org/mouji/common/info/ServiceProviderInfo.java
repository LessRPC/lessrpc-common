package org.mouji.common.info;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * class that provides information of a service provider
 * 
 * @author Salim
 *
 */
public class ServiceProviderInfo {

	/**
	 * ip address of the server
	 */
	private String url;

	/**
	 * port of the RPC server
	 */
	private int port;

	/**
	 * Environment of the stub for example language
	 */
	private StubEnvInfo env;

	public ServiceProviderInfo() {
		// Dummy Constructor for use of RPC
	}

	public ServiceProviderInfo(String url, int port, StubEnvInfo env) {
		this.url = url;
		this.port = port;
		this.env = env;
	}

	@JsonProperty("port")
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@JsonProperty("url")
	public String getURL() {
		return url;
	}

	public void setURL(String ip) {
		this.url = ip;
	}

	@JsonProperty("env")
	public StubEnvInfo getEnv() {
		return env;
	}

	public void setEnv(StubEnvInfo env) {
		this.env = env;
	}

	@Override
	public String toString() {
		return "{ServiceProviderInfo url:" + url + ", port: " + port +", env: "+env+" }";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ServiceProviderInfo)) {
			return false;
		}

		ServiceProviderInfo info = (ServiceProviderInfo) obj;
		return (info.getEnv() != null && this.getEnv() != null && info.getEnv().equals(this.getEnv()))
				&& info.getPort() == this.getPort()
				&& (info.getURL() != null && this.getURL() != null && info.getURL().equals(this.getURL()));
	}
	
	
	
	

}
