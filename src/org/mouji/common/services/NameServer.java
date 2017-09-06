package org.mouji.common.services;

import java.sql.SQLException;

import org.mouji.common.errors.DatabaseNotSupported;
import org.mouji.common.info.ServiceInfo;
import org.mouji.common.info.ServiceProviderInfo;
import org.mouji.common.info.ServiceSupportInfo;
import org.mouji.common.loadbalance.ProviderLoadBalancer;

/**
 * service description for name server
 * 
 * @author Salim
 *
 */
public interface NameServer {
	/**
	 * 
	 * Returns one service provider information for a service given the
	 * service's id. The process of choosing a service provider may have been
	 * random or based on a load balancing strategy. However, the decision is
	 * made by the name server
	 * 
	 * @param service
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public ServiceSupportInfo getProvider(ServiceInfo<?> service)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	/**
	 * This function returns all service providers implementing the requested
	 * service
	 * 
	 * @param service
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public ServiceSupportInfo[] getProviders(ServiceInfo<?> service)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	/**
	 * returns all Service Provider informations for all avaialble services
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public ServiceSupportInfo[] getAllProviders() throws ClassNotFoundException, SQLException, DatabaseNotSupported;

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
	 * Registers a new service provider for given service information
	 * 
	 * 
	 * @param support
	 *            of type ServiceSupportInfo
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public boolean register(ServiceSupportInfo support)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	/**
	 * Unregisters a new service provider for given service information
	 * 
	 * @param service
	 * @param provider
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	public boolean unregister(ServiceInfo<?> service, ServiceProviderInfo provider)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported;

	/**
	 * Get used load balancer
	 * 
	 * @return
	 */
	public ProviderLoadBalancer getLoadBalancer();

	/**
	 * Set the load balancer for Name Server instance
	 * 
	 * @param balancer
	 */
	public void setLoadBalancer(ProviderLoadBalancer balancer);

	/**
	 * Returns the URL of the current server
	 * 
	 * @return
	 */
	public String getURL();

	/**
	 * Returns the port to create name server on
	 * 
	 * @return
	 */
	public int getPort();

	/**
	 * Determines if everything is working properly
	 * 
	 * @return
	 */
	public boolean ping();

}
