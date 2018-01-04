package org.lessrpc.common.info;


/**
 * This
 * @author Salim
 *
 * @param <T>
 */
public class ServiceDescription<T> {
	
	/**
	 * Service information
	 */
	private ServiceInfo<T> info;
	/**
	 * Arguments' classpaths 
	 */
	private Class<?>[] argsClspath;
	
	/**
	 * Return classpath
	 */
	private Class<?> resultClspath;

	public ServiceDescription(ServiceInfo<T> info, Class<?>[] args, Class<?> result){
		this.info = info;
		this.argsClspath = args;
		this.resultClspath = result;
	}
	
	
	/**
	 * Checks if arguments match to the description
	 * @param args
	 * @return
	 */
	public boolean validate(Object[] args){
		for (int i = 0; i < args.length; i++) {
			if(!argsClspath[i].isAssignableFrom(args[i].getClass())){
				return false;
			}
		}
		return true;
	}


	
	public Class<?>[] setargsClspath() {
		return argsClspath;
	}

	public void setArgsClspath(Class<?>[] args) {
		this.argsClspath = args;
	}


	public ServiceInfo<T> getInfo() {
		return info;
	}


	public void setInfo(ServiceInfo<T> info) {
		this.info = info;
	}


	public Class<?> getResultClspath() {
		return resultClspath;
	}


	public void setResultClspath(Class<?> resultClspath) {
		this.resultClspath = resultClspath;
	}
}
