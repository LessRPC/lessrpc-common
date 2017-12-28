package org.lessrpc.common.info;

public class NameServerInfo {

	private String address;

	private  int port;

	public NameServerInfo() {
		// Dummy Constructor for use of RPC
	}

	public NameServerInfo(String address, int port) {
		this.address = address;
		this.port = port;

	}

	public String getAddress() {
		return address;
	}

	public int getPort() {
		return port;
	}

}
