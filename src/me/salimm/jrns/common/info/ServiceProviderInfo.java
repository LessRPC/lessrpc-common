package me.salimm.jrns.common.info;

import me.salimm.jrns.common.types.StubEnvType;

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
	private String ip;

	/**
	 * port of the RPC server
	 */
	private int port;

	/**
	 * name of the provider
	 */
	private String providerName;

	/**
	 * Environment of the stub for example language
	 */
	private StubEnvType stubType;

	public ServiceProviderInfo() {
		// Dummy Constructor for use of RPC
	}

	public ServiceProviderInfo(String ip, int port, String providerName, StubEnvType envType) {
		this.ip = ip;
		this.port = port;
		this.providerName = providerName;
		stubType = envType;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public StubEnvType getStubType() {
		return stubType;
	}

	public void setStubType(StubEnvType stubType) {
		this.stubType = stubType;
	}

	@Override
	public String toString() {
		return "{ServiceProviderInfo url:" + ip + ", port: " + port + " }";
	}

}
