package org.lessrpc.common.services;

import org.lessrpc.common.info.ServiceDescription;
import org.lessrpc.common.info.ServiceInfo;
import org.lessrpc.common.info.ServiceProviderInfo;
import org.lessrpc.common.info.ServiceSupportInfo;

public interface NameServerServices {

	// =============================================================
	// ==================Get Providers =============================
	// =============================================================
	/**
	 * Service to get best provider for a specific service
	 */
	public static final ServiceDescription<ServiceSupportInfo> GET_PROVIDER = new ServiceDescription<ServiceSupportInfo>(
			new ServiceInfo<ServiceSupportInfo>("getProvider", 1), new Class[] { ServiceInfo.class },
			ServiceSupportInfo.class);
	/**
	 * Service to get all providers for a specific service
	 */
	public static final ServiceDescription<ServiceSupportInfo[]> GET_PROVIDERS = new ServiceDescription<ServiceSupportInfo[]>(
			new ServiceInfo<ServiceSupportInfo[]>("getProviders", 2), new Class[] { ServiceInfo.class },
			ServiceSupportInfo[].class);

	/**
	 * Service to get all providers available for all services
	 */
	public static final ServiceDescription<ServiceSupportInfo[]> GET_ALL_PROVIDERS = new ServiceDescription<ServiceSupportInfo[]>(
			new ServiceInfo<ServiceSupportInfo[]>("getAllProviders", 3), new Class[] {}, ServiceSupportInfo[].class);

	// =============================================================
	// ==================Service Info=============================
	// =============================================================

	/**
	 * Service info for service that provides detail service info object given
	 * the name of service
	 */
	public static final ServiceDescription<ServiceInfo<?>> GET_SERVICE_INFO_BY_NAME = new ServiceDescription<ServiceInfo<?>>(
			new ServiceInfo<ServiceInfo<?>>("getServiceInfoByName", 4), new Class[] { String.class },
			ServiceInfo.class);

	/**
	 * Service info for service that provides detail service info object given
	 * the id of service
	 */
	public static final ServiceDescription<ServiceInfo<?>> GET_SERVICE_INFO_BY_ID = new ServiceDescription<ServiceInfo<?>>(
			new ServiceInfo<ServiceInfo<?>>("getServiceInfoById", 5), new Class[] { Integer.class }, ServiceInfo.class);

	// =============================================================
	// ==================Register/unregister=============================
	// =============================================================

	/**
	 * Service info for service that allows unregistering a provider from a
	 * service
	 */
	public static final ServiceDescription<Boolean> REGISTER = new ServiceDescription<Boolean>(
			new ServiceInfo<Boolean>("register", 6), new Class[] { ServiceSupportInfo.class }, Boolean.class);

	/**
	 * Service info for unregistering a provider to a service
	 */
	public static final ServiceDescription<Boolean> UNREGISTER = new ServiceDescription<Boolean>(
			new ServiceInfo<Boolean>("unregister", 7), new Class[] { ServiceInfo.class, ServiceProviderInfo.class },
			Boolean.class);

	/**
	 * Service info for unregistering a provider from all services
	 */
	public static final ServiceDescription<Boolean> UNREGISTER_ALL = new ServiceDescription<Boolean>(
			new ServiceInfo<Boolean>("unregisterAll", 8), new Class[] { ServiceProviderInfo.class }, Boolean.class);

	/**
	 * Service info for checking a provider status. The returned boolean
	 * determines that this task has been carried out or not. It doesn't
	 * indicate whether the provider is unreachable or not
	 */
	public static final ServiceDescription<Boolean> CHECK_PROVIDER_STATUS = new ServiceDescription<Boolean>(
			new ServiceInfo<Boolean>("checkProviderStatus", 9), new Class[] { ServiceProviderInfo.class },
			Boolean.class);

}
