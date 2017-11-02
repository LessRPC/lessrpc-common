package org.mouji.common.services;

import java.io.IOException;
import java.sql.SQLException;

import org.mouji.common.errors.DatabaseNotSupported;
import org.mouji.common.errors.RPCException;
import org.mouji.common.errors.RPCProviderFailureException;
import org.mouji.common.errors.ResponseContentTypeCannotBePrasedException;
import org.mouji.common.errors.SerializationFormatNotSupported;
import org.mouji.common.info.ServiceInfo;
import org.mouji.common.info.ServiceProviderInfo;
import org.mouji.common.info.ServiceSupportInfo;

/**
 * service description for name server
 * 
 * @author Salim
 *
 */
public interface NameServerFunctions {
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
	 * @throws Exception
	 * @throws IOException
	 * @throws RPCProviderFailureException
	 * @throws RPCException
	 * @throws SerializationFormatNotSupported
	 * @throws ResponseContentTypeCannotBePrasedException
	 */
	public ServiceSupportInfo getProvider(ServiceInfo<?> service) throws ClassNotFoundException, SQLException,
			DatabaseNotSupported, ResponseContentTypeCannotBePrasedException, SerializationFormatNotSupported,
			RPCException, RPCProviderFailureException, IOException, Exception;

	/**
	 * This function returns all service providers implementing the requested
	 * service
	 * 
	 * @param service
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
	public ServiceSupportInfo[] getProviders(ServiceInfo<?> service) throws ClassNotFoundException, SQLException,
			DatabaseNotSupported, ResponseContentTypeCannotBePrasedException, SerializationFormatNotSupported,
			RPCException, RPCProviderFailureException, IOException, Exception;

	/**
	 * returns all Service Provider informations for all available services
	 * 
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
	public ServiceSupportInfo[] getAllProviders() throws ClassNotFoundException, SQLException, DatabaseNotSupported,
			ResponseContentTypeCannotBePrasedException, SerializationFormatNotSupported, RPCException,
			RPCProviderFailureException, IOException, Exception;

	/**
	 * returns a service information object for given service name
	 * 
	 * @param serviceName
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
	public ServiceInfo<?> getServiceInfoByName(String serviceName) throws ClassNotFoundException, SQLException,
			DatabaseNotSupported, ResponseContentTypeCannotBePrasedException, SerializationFormatNotSupported,
			RPCException, RPCProviderFailureException, IOException, Exception;

	/**
	 * returns a service information object for given service id
	 * 
	 * @param serviceId
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
	public ServiceInfo<?> getServiceInfoById(int serviceId) throws ClassNotFoundException, SQLException,
			DatabaseNotSupported, ResponseContentTypeCannotBePrasedException, SerializationFormatNotSupported,
			RPCException, RPCProviderFailureException, IOException, Exception;

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
	 * @throws Exception
	 * @throws IOException
	 * @throws RPCProviderFailureException
	 * @throws RPCException
	 * @throws SerializationFormatNotSupported
	 * @throws ResponseContentTypeCannotBePrasedException
	 */
	public boolean register(ServiceSupportInfo support) throws ClassNotFoundException, SQLException,
			DatabaseNotSupported, ResponseContentTypeCannotBePrasedException, SerializationFormatNotSupported,
			RPCException, RPCProviderFailureException, IOException, Exception;

	/**
	 * Unregisters a new service provider for given service information
	 * 
	 * @param service
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
	public boolean unregister(ServiceInfo<?> service, ServiceProviderInfo provider) throws ClassNotFoundException,
			SQLException, DatabaseNotSupported, ResponseContentTypeCannotBePrasedException,
			SerializationFormatNotSupported, RPCException, RPCProviderFailureException, IOException, Exception;

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
	boolean unregisterAll(ServiceProviderInfo provider) throws ClassNotFoundException, SQLException,
			DatabaseNotSupported, ResponseContentTypeCannotBePrasedException, SerializationFormatNotSupported,
			RPCException, RPCProviderFailureException, IOException, Exception;

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
	public boolean checkProviderStatus(ServiceProviderInfo provider) throws ResponseContentTypeCannotBePrasedException, SerializationFormatNotSupported, RPCException, RPCProviderFailureException, IOException, Exception;

	/**
	 * Determines if everything is working properly
	 * 
	 * @return
	 * @throws Exception
	 */
	public boolean ping() throws Exception;

}
