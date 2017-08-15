package org.mouji.common.info;

/**
 * 
 * <h5>Service Support</h5>
 * 
 * <p>
 * ServiceSupport object contains the following fields:
 * </p>
 * <ul style="list-style-type: circle; margin-left: 3em;">
 * <li><strong>service*: </strong>Instance of ServiceInfo</li>
 * <li><strong>serializers*: </strong>Array of SerializationFormat objects</li>
 * </ul>
 * <br/>
 * 
 * @author Salim
 *
 */
public class ServiceSupportInfo {

	private ServiceInfo<?> service;

	private SerializationFormat[] serializers;

	/**
	 * Dummy constructor for Serializer
	 */
	public ServiceSupportInfo() {
	}

	public ServiceSupportInfo(ServiceInfo<?> service, SerializationFormat[] serializers) {
		this.service = service;
		this.serializers = serializers;
	}

	public ServiceInfo<?> getService() {
		return service;
	}

	public void setService(ServiceInfo<?> service) {
		this.service = service;
	}

	public SerializationFormat[] getSerializers() {
		return serializers;
	}

	public void setSerializers(SerializationFormat[] serializers) {
		this.serializers = serializers;
	}

	@Override
	public String toString() {
		String tmp = "{Serialization Support,  list=[";
		for (SerializationFormat sf : serializers) {
			tmp += sf + " , ";
		}
		return tmp + "]}";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ServiceSupportInfo))
			return false;
		ServiceSupportInfo ssi = (ServiceSupportInfo) obj;

		if (!ssi.service.equals(this.getService()))
			return false;

		if (!(ssi.getSerializers().length == this.getSerializers().length)) {
			return false;
		}

		for (int i = 0; i < serializers.length; i++) {
			if (!(serializers[i].equals(this.getSerializers()[i]))) {
				return false;
			}
		}

		return true;
	}
}
