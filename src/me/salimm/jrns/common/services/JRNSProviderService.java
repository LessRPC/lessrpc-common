package me.salimm.jrns.common.services;

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
	public Object execute(Object[] args);
}
