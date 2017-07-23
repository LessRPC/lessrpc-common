package me.salimm.jrns.common.info;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * service information
 * 
 * @author Salim
 *
 */
public class ServiceInfo<T> {

	/**
	 * name of the service
	 */
	private String name;

	/**
	 * id of the service
	 */
	private int id;

	public ServiceInfo() {
		// Dummy Constructor for use of RPC
	}

	public ServiceInfo(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("sid")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "{ServiceInfo   name:'" + getName() + "', id:" + id + "}";
	}
}
