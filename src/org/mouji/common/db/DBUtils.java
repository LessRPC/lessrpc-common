package org.mouji.common.db;

import java.sql.Connection;
import java.sql.SQLException;

import org.mouji.common.info.ServiceInfo;
import org.mouji.common.info.ServiceProviderInfo;
import org.mouji.common.info.ServiceSupportInfo;

public interface DBUtils {

	/**
	 * get list of all Server info that implements service with given id
	 * 
	 * @param serviceId
	 * @return
	 * @throws SQLException
	 */
	public ServiceSupportInfo[] getProviders(Connection conn, ServiceInfo<?> serivce) throws SQLException;

	/**
	 * get list of all Server info for all service
	 * 
	 * @param serviceId
	 * @return
	 * @throws SQLException
	 */
	public ServiceSupportInfo[] getAllProviders(Connection conn) throws SQLException;

	/**
	 * 
	 * get ServiceInfo for given service name
	 * 
	 * @param serviceName
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public ServiceInfo<?> getServiceInfo(Connection conn, String serviceName)
			throws SQLException, ClassNotFoundException;

	/**
	 * 
	 * get ServiceInfo for given service id
	 * 
	 * @param serviceId
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public ServiceInfo<?> getServiceInfo(Connection conn, int serviceId) throws SQLException, ClassNotFoundException;

	/**
	 * 
	 * register given server for given service
	 * 
	 * @param service
	 * @param provider
	 * @return
	 */
	public boolean register(Connection conn, ServiceSupportInfo support);

	/**
	 * remove given server from given service
	 * 
	 * 
	 * @param service
	 * @param provider
	 * @return
	 */
	public boolean unregister(Connection conn, ServiceInfo<?> service, ServiceProviderInfo provider);
	
	/**
	 * remove given server from all its registered services
	 * 
	 * 
	 * @param service
	 * @param provider
	 * @return
	 */
	public boolean unregisterAll(Connection conn, ServiceProviderInfo provider);

	/**
	 * 
	 * Creates service table
	 * 
	 * @param conn
	 * @return
	 */
	public boolean createServiceTable(Connection conn);

	/**
	 * 
	 * Creates service provider table
	 * 
	 * @param conn
	 * @return
	 */
	public boolean createServiceProviderTable(Connection conn);

	/**
	 * 
	 * Creates service support table
	 * 
	 * @param conn
	 * @return
	 */
	public boolean createServiceSupportTable(Connection conn);

	public boolean cleanAllTables(Connection conn);
}
