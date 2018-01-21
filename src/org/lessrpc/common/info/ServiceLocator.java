package org.lessrpc.common.info;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ServiceLocator
 * 
 * @author Salim
 *
 */
public class ServiceLocator {

	private Map<Integer, ServiceDescription<?>> map;

	public ServiceLocator() {
		map = new HashMap<Integer, ServiceDescription<?>>();
	}

	public void put(ServiceDescription<?> desc) {
		map.put(desc.getInfo().getId(), desc);
	}

	public ServiceDescription<?> locate(int id) {
		return map.get(id);
	}

	public static ServiceLocator create(ServiceDescription<?> desc) {
		ServiceLocator loc = new ServiceLocator();
		loc.put(desc);
		return loc;
	}

	public static ServiceLocator create(@SuppressWarnings("rawtypes") List<ServiceDescription> list) {
		ServiceLocator loc = new ServiceLocator();
		for (ServiceDescription<?> desc : list) {
			loc.put(desc);
		}
		return loc;
	}

}
