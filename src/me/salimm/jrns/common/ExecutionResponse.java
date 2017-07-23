package me.salimm.jrns.common;

import me.salimm.jrns.common.info.ResponseInfo;

/**
 * execution response of output
 * 
 * @author Salim
 *
 */
public class ExecutionResponse {

	/**
	 * execution response info including status and result object type
	 */
	private ResponseInfo info;
	/**
	 * result json string
	 */
	private String resultJson;

	public ExecutionResponse(ResponseInfo info, String resultJson) {
		this.setInfo(info);
		this.setResultJson(resultJson);
	}

	/**
	 * dummy constructor for RPC
	 */
	public ExecutionResponse() {
	}

	public ResponseInfo getInfo() {
		return info;
	}

	public void setInfo(ResponseInfo info) {
		this.info = info;
	}

	public String getResultJson() {
		return resultJson;
	}

	public void setResultJson(String resultJson) {
		this.resultJson = resultJson;
	}
}
