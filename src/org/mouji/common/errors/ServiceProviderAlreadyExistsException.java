package org.mouji.common.errors;

import org.mouji.common.info.ServiceProviderInfo;

public class ServiceProviderAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceProviderAlreadyExistsException(ServiceProviderInfo sp) {
		super("Servicer Proivder already regeistered: " + sp.toString());
	}

}
