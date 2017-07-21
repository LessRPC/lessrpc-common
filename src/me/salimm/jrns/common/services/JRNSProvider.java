package me.salimm.jrns.common.services;

import me.salimm.jrns.common.info.ServiceInfo;
import me.salimm.jrns.common.info.ServiceProviderInfo;

public interface JRNSProvider<T> extends JRNSProviderService{

	public ServiceInfo<T> getServiceInfo();
	
	public ServiceProviderInfo getInfo();
}
