package org.mouji.common.services;

import java.sql.SQLException;

import org.mouji.common.errors.DatabaseNotSupported;
import org.mouji.common.info.ServiceInfo;
import org.mouji.common.info.ServiceProviderInfo;

/**
 * service desctiption for name server
 * @author Salim
 *
 */
public interface NameServer {

	/**
	 * returns one random/best service provider information for a service given the service's id
	 * @param serviceId
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public ServiceProviderInfo getServerById(int serviceId)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	/**
	 * returns one random/best service provider information for a service given the service's name
	 * 
	 * @param serviceName
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public ServiceProviderInfo getServerByName(String serviceName)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	
	/**
	 * returns all random/best service provider information for a service given the service's id
	 * 
	 * @param serviceId
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public ServiceProviderInfo[] getAllServersById(int serviceId)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	/**
	 * returns all random/best service provider information for a service given the service's name
	 * 
	 * @param serviceName
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public ServiceProviderInfo[] getAllServersByName(String serviceName)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;
	
	/**
	 * returns all Service Provider informations for all avaialble services
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public ServiceProviderInfo[] getAllServer()
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	
	/**
	 * returns a service information object for given service name
	 * 
	 * @param serviceName
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public ServiceInfo<?> getServiceInfoByName(String serviceName)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	/**
	 * returns a service information object for given service id
	 * 
	 * @param serviceId
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public ServiceInfo<?> getServiceInfoById(int serviceId)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	/**
	 * registers a new service provider for given service information
	 * @param service
	 * @param provider
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public boolean registerServiceProvider(ServiceInfo<?> service, ServiceProviderInfo provider)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	
	/**
	 * unregisters a new service provider for given service information
	 * 
	 * @param service
	 * @param provider
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public boolean removeServiceProvider(ServiceInfo<?> service, ServiceProviderInfo provider)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

}
