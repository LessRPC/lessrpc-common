package me.salimm.jrns.common.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import me.salimm.jrns.common.types.StatusType;

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
	private StatusType type;

	public ResponseInfo(StatusType type, String outputType) {
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

	@JsonProperty("statusType")
	public StatusType getType() {
		return type;
	}

	public void setType(StatusType type) {
		this.type = type;
	}

}
