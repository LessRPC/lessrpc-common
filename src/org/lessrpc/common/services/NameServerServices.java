package org.lessrpc.common.services;

import org.lessrpc.common.info.ServiceInfo;
import org.lessrpc.common.info.ServiceSupportInfo;

public interface NameServerServices {

	// =============================================================
	// ==================Get Providers =============================
	// =============================================================
	/**
	 * Service to get best provider for a specific service
	 */
	public static final ServiceInfo<ServiceSupportInfo> GET_PROVIDER = new ServiceInfo<ServiceSupportInfo>(
			"getProvider", 1);
	/**
	 * Service to get all providers for a specific service
	 */
	public static final ServiceInfo<ServiceSupportInfo[]> GET_PROVIDERS = new ServiceInfo<ServiceSupportInfo[]>(
			"getProviders", 2);

	/**
	 * Service to get all providers available for all services
	 */
	public static final ServiceInfo<ServiceSupportInfo[]> GET_ALL_PROVIDERS = new ServiceInfo<ServiceSupportInfo[]>(
			"getAllProviders", 3);

	// =============================================================
	// ==================Service Info=============================
	// =============================================================

	/**
	 * Service info for service that provides detail service info object given
	 * the name of service
	 */
	public static final ServiceInfo<ServiceInfo<?>> GET_SERVICE_INFO_BY_NAME = new ServiceInfo<ServiceInfo<?>>(
			"getServiceInfoByName", 4);

	/**
	 * Service info for service that provides detail service info object given
	 * the id of service
	 */
	public static final ServiceInfo<ServiceInfo<?>> GET_SERVICE_INFO_BY_ID = new ServiceInfo<ServiceInfo<?>>(
			"getServiceInfoById", 5);

	// =============================================================
	// ==================Register/unregister=============================
	// =============================================================

	/**
	 * Service info for service that allows unregistering a provider from a
	 * service
	 */
	public static final ServiceInfo<Boolean> REGISTER = new ServiceInfo<Boolean>("register", 6);

	/**
	 * Service info for unregistering a provider to a service
	 */
	public static final ServiceInfo<Boolean> UNREGISTER = new ServiceInfo<Boolean>("unregister", 7);

	/**
	 * Service info for unregistering a provider from all services
	 */
	public static final ServiceInfo<Boolean> UNREGISTER_ALL = new ServiceInfo<Boolean>("unregisterAll", 8);

	/**
	 * Service info for checking a provider status. The returned boolean
	 * determines that this task has been carried out or not. It doesn't
	 * indicate whether the provider is unreachable or not
	 */
	public static final ServiceInfo<Boolean> CHECK_PROVIDER_STATUS = new ServiceInfo<Boolean>("checkProviderStatus", 9);

}
