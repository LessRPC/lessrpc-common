package me.salimm.jrns.common.services;


import me.salimm.jrns.common.ExecutionResponse;
import me.salimm.jrns.common.info.ClientInfo;
import me.salimm.jrns.common.info.ServiceInfo;

public interface JRNSProviderService {

	/**
	 * 
	 * This is called to check if the server is working. It has to just return a
	 * boolean flag
	 * 
	 * @return
	 */
	public boolean isWorking();

	/**
	 * 
	 * execute the function
	 * 
	 * @param args
	 * @return
	 */
	public ExecutionResponse execute(ClientInfo cInfo, ServiceInfo<?> service, Object[] args);
}
