package org.lessrpc.common.services;

import java.io.IOException;
import java.sql.SQLException;

import org.lessrpc.common.errors.ApplicationSpecificErrorException;
import org.lessrpc.common.errors.DatabaseNotSupported;
import org.lessrpc.common.errors.RPCException;
import org.lessrpc.common.errors.RPCProviderFailureException;
import org.lessrpc.common.errors.SerializationFormatNotSupported;
import org.lessrpc.common.info.ServiceInfo;
import org.lessrpc.common.info.ServiceProviderInfo;
import org.lessrpc.common.info.ServiceSupportInfo;
import org.lessrpc.common.loadbalance.ProviderLoadBalancer;

/**
 * service description for name server
 * 
 * @author Salim
 *
 */
public interface NameServer extends NameServerFunctions {
	
	
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
	@Override
	public ServiceSupportInfo getProvider(ServiceInfo<?> service)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported, ApplicationSpecificErrorException;

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
	@Override
	public ServiceSupportInfo[] getProviders(ServiceInfo<?> service)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported, ApplicationSpecificErrorException;

	/**
	 * returns all Service Provider informations for all avaialble services
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	@Override
	public ServiceSupportInfo[] getAllProviders() throws ClassNotFoundException, SQLException, DatabaseNotSupported, ApplicationSpecificErrorException;

	/**
	 * returns a service information object for given service name
	 * 
	 * @param serviceName
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	@Override
	public ServiceInfo<?> getServiceInfoByName(String serviceName)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported, ApplicationSpecificErrorException;

	/**
	 * returns a service information object for given service id
	 * 
	 * @param serviceId
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 */
	@Override
	public ServiceInfo<?> getServiceInfoById(int serviceId)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported, ApplicationSpecificErrorException;

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
	 * @throws ApplicationSpecificErrorException 
	 */
	@Override
	public boolean register(ServiceSupportInfo support)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported, ApplicationSpecificErrorException;

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
	@Override
	public boolean unregister(ServiceInfo<?> service, ServiceProviderInfo provider)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported, ApplicationSpecificErrorException;

	/**
	 * Unregisters a new service provider for given service information
	 * 
	 * @param provider
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws DatabaseNotSupported
	 * @throws Exception
	 * @throws IOException
	 * @throws RPCProviderFailureException
	 * @throws RPCException
	 * @throws SerializationFormatNotSupported
	 * @throws ResponseContentTypeCannotBePrasedException
	 */
	@Override
	boolean unregisterAll(ServiceProviderInfo provider)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported, ApplicationSpecificErrorException;

	/**
	 * This function forces the name server to check a provider's status and
	 * update its tables. The returned boolean indicates that the check was done
	 * or not and is not related to the actual status of the provider
	 * 
	 * @param provider
	 * @return
	 * @throws Exception
	 * @throws IOException
	 * @throws RPCProviderFailureException
	 * @throws RPCException
	 * @throws SerializationFormatNotSupported
	 * @throws ResponseContentTypeCannotBePrasedException
	 */
	@Override
	public boolean checkProviderStatus(ServiceProviderInfo provider)
			throws ClassNotFoundException, SQLException, DatabaseNotSupported, ApplicationSpecificErrorException;

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

	public void reset() throws SQLException, ClassNotFoundException, DatabaseNotSupported;

}
