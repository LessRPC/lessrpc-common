package org.mouji.common.services;

import org.mouji.common.info.ServiceSupportInfo;
import org.mouji.common.info.responses.ServiceResponse;

import java.sql.SQLException;
import java.util.List;

import org.mouji.common.errors.ApplicationSpecificErrorException;
import org.mouji.common.errors.DatabaseNotSupported;
import org.mouji.common.errors.ExecuteInternalError;
import org.mouji.common.errors.InvalidArgsException;
import org.mouji.common.errors.ServiceNotSupportedException;
import org.mouji.common.info.ServiceInfo;
import org.mouji.common.info.ServiceProviderInfo;
import org.mouji.common.info.ServiceRequest;

public interface ServiceProvider {

	/**
	 * 
	 * This is called to check if the server is working. It has to just return a
	 * boolean flag
	 * 
	 * @return
	 */
	public boolean ping();

	/**
	 * 
	 * execute a service
	 * 
	 * @param args
	 * @return
	 */
	public ServiceResponse<?> execute(ServiceRequest request) throws ApplicationSpecificErrorException, ExecuteInternalError, InvalidArgsException,
	ServiceNotSupportedException, ClassNotFoundException, SQLException, DatabaseNotSupported ;

	/**
	 * 
	 * This is called to get the ServiceProivder info regarding this service provider
	 * 
	 * @return
	 */
	public ServiceProviderInfo info();

	/**
	 * 
	 * This is called to get ServuceSupportInfo for a service. It will return ServiceNotSupported Exception 
	 * 
	 * @return
	 */
	public ServiceSupportInfo service(ServiceInfo<?> info) throws ServiceNotSupportedException;
	
	/**
	 * Returns the list of all supported services
	 * @return
	 */
	public List<ServiceSupportInfo> listSupport();

}
