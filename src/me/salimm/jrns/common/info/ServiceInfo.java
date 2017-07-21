package me.salimm.jrns.common.info;

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
	private int sid;

	/**
	 * types of the input arguments
	 */

	private Class<?>[] inputTypes;

	/**
	 * type of the output object
	 */
	private Class<T> outputType;

	public ServiceInfo() {
		// Dummy Constructor for use of RPC
	}

	public ServiceInfo(String name, int sid, Class<?>[] inputTypes, Class<T> outputType) {
		this.name = name;
		this.sid = sid;
		this.inputTypes = inputTypes;
		this.outputType = outputType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return sid;
	}

	public void setId(int id) {
		this.sid = id;
	}

	public Class<?>[] getInputTypes() {
		return inputTypes;
	}

	public void setInputTypes(Class<?>[] inputTypes) {
		this.inputTypes = inputTypes;
	}

	public Class<T> getOutputType() {
		return outputType;
	}

	public void setOutputType(Class<T> outputType) {
		this.outputType = outputType;
	}

	@Override
	public String toString() {
		return "{ServiceInfo   name:'"+getName()+"', id:"+sid+", outputType:'"+outputType.getName()+"'}";
	}
}
