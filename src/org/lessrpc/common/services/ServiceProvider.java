package org.lessrpc.common.services;

import java.sql.SQLException;
import java.util.List;

import org.lessrpc.common.errors.ApplicationSpecificErrorException;
import org.lessrpc.common.errors.DatabaseNotSupported;
import org.lessrpc.common.errors.ExecuteInternalError;
import org.lessrpc.common.errors.InvalidArgsException;
import org.lessrpc.common.errors.ServiceNotSupportedException;
import org.lessrpc.common.info.ServiceDescription;
import org.lessrpc.common.info.ServiceInfo;
import org.lessrpc.common.info.ServiceProviderInfo;
import org.lessrpc.common.info.ServiceRequest;
import org.lessrpc.common.info.ServiceSupportInfo;
import org.lessrpc.common.info.responses.ServiceResponse;

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
	
	/**
	 * Returns the list of all supported services
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<ServiceDescription> listServices();

}
