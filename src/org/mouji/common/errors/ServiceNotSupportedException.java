package org.mouji.common.errors;

import org.mouji.common.info.ServiceInfo;

public class ServiceNotSupportedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceNotSupportedException(ServiceInfo<?> info) {
		super("Service not supported by provider - service info: " + info);
	}
}
