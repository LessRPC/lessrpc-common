package me.salimm.jrns.common.info;

import me.salimm.jrns.common.types.ResponseType;

/**
 * contains information regarding the response including status and output type
 * 
 * @author Salim
 *
 */
public class ResponseInfo {

	/**
	 * classpath to output
	 */
	private String outputType;
	/**
	 * status of response
	 */
	private ResponseType type;

	public ResponseInfo(ResponseType type, String outputType) {
		this.setType(type);
		this.setOutputType(outputType);

	}

	/**
	 * dummy constructor for RPC
	 */
	public ResponseInfo() {
	}

	public String getOutputType() {
		return outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}

	public ResponseType getType() {
		return type;
	}

	public void setType(ResponseType type) {
		this.type = type;
	}

}
