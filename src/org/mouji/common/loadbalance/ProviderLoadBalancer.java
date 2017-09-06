package org.mouji.common.loadbalance;

import org.mouji.common.info.ServiceInfo;
import org.mouji.common.info.ServiceSupportInfo;

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
