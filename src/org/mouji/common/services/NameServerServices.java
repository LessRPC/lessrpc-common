package org.mouji.common.services;

import org.mouji.common.info.ServiceInfo;
import org.mouji.common.info.ServiceSupportInfo;

public class NameServerServices {

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
	public static final ServiceInfo<ServiceSupportInfo> GET_PROVIDERS = new ServiceInfo<ServiceSupportInfo>(
			"getProviders", 2);

	/**
	 * Service to get all providers available for all services
	 */
	public static final ServiceInfo<ServiceSupportInfo> GET_ALL_PROVIDERS = new ServiceInfo<ServiceSupportInfo>(
			"getAllProviders", 3);

	// =============================================================
	// ==================Service Info=============================
	// =============================================================

	/**
	 * Service info for service that provides detail service info object given
	 * the name of service
	 */
	public static final ServiceInfo<ServiceSupportInfo> GET_SERVICE_INFO_BY_NAME = new ServiceInfo<ServiceSupportInfo>(
			"getServiceInfoByName", 4);

	/**
	 * Service info for service that provides detail service info object given
	 * the id of service
	 */
	public static final ServiceInfo<ServiceSupportInfo> GET_SERVICE_INFO_BY_ID = new ServiceInfo<ServiceSupportInfo>(
			"getServiceInfoById", 5);

	// =============================================================
	// ==================Register/unregister=============================
	// =============================================================

	/**
	 * Service info for service that allows unregistering a provider from a
	 * service
	 */
	public static final ServiceInfo<ServiceSupportInfo> REGISTER = new ServiceInfo<ServiceSupportInfo>("register", 6);

	/**
	 * Service info for registering a provider to a service
	 */
	public static final ServiceInfo<ServiceSupportInfo> UNREGISTER = new ServiceInfo<ServiceSupportInfo>("unregister",
			7);
}
