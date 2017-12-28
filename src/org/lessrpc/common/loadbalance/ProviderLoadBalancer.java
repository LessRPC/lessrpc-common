package org.lessrpc.common.loadbalance;

import org.lessrpc.common.info.ServiceInfo;
import org.lessrpc.common.info.ServiceSupportInfo;

/**
 * Load balancers providers a load balancing strategy for service providers that
 * implement the same service
 * 
 * @author Salim
 *
 */
public interface ProviderLoadBalancer {

	/**
	 * Selects a service provider based on the balancing strategy
	 * 
	 * @param supports
	 * @return
	 */
	public ServiceSupportInfo select(ServiceInfo<?> service, ServiceSupportInfo[] supports);

}
