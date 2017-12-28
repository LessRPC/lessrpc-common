package org.lessrpc.common.info;

import org.lessrpc.common.CommonConstants;
import org.lessrpc.common.LessUtils;
import org.lessrpc.common.errors.SerializationFormatHTTPNotParsable;

/**
 * 
 * <h5>Serialization Format</h5>
 * 
 * <p>
 * SerializationFormat object contains the following fields:
 * </p>
 * <ul style="list-style-type: circle; margin-left: 3em;">
 * <li><strong>format*: </strong>Name of serialization format</li>
 * <li><strong>version*: </strong>Version information</li>
 * </ul>
 * <br/>
 * 
 * @author Salim
 *
 */
public class SerializationFormat implements CommonConstants {

	/**
	 * name for the name of serialization format
	 */
	private String name;

	/**
	 * format vesion information
	 */
	private String version;

	public SerializationFormat(String name, String version) {
		this.name = name.trim().toLowerCase();
		this.version = version.trim().toLowerCase();
	}

	/**
	 * dummy constructor for RPC
	 */
	public SerializationFormat() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		String key = this.getName() + "/" + this.getVersion();
		return key.hashCode();
	}

	public String httpFormat() {
		return "application/vnd.less ;lessversion=\"" + LessUtils.lessVersion() + "\" ; format=\"" + this.getName()
				+ "\" ; formatversion=\"" + this.getVersion() + "\"";
	}

	public static SerializationFormat parseHTTPFormat(String txt) throws SerializationFormatHTTPNotParsable {
		String[] parts = txt.split(";");
		String name = null;
		String version = null;

		for (int i = 1; i < parts.length; i++) {
			int eqIdx = parts[i].trim().indexOf("=");
			int eqQIdx = parts[i].trim().indexOf("=\"");
			String fieldName = parts[i].trim().substring(0, eqIdx);
			String value = null;
			if (eqQIdx != -1) {
				value = parts[i].trim().substring(eqQIdx + 2, parts[i].trim().length() - 1);
			} else {
				value = parts[i].trim().substring(eqIdx + 2, parts[i].trim().length() - 1);
			}

			if (fieldName.equals(SERIALIZATION_FORMAT_HTTP_FORMAT_FIELD_NAME)) {
				name = value;
			} else if (fieldName.equals(SERIALIZATION_FORMAT_HTTP_FORMAT_FIELD_VERSION)) {
				version = value;
			}
		}
		if(name == null || version ==null){
			throw new SerializationFormatHTTPNotParsable(txt);
		}
		return new SerializationFormat(name, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SerializationFormat))
			return false;
		SerializationFormat sf = (SerializationFormat) obj;

		return sf.getName().equals(this.getName()) && sf.getVersion().equals(this.getVersion());
	}

	@Override
	public String toString() {
		return "{SerializationFormat name=\"" + getName() + "\", version=\"" + getVersion() + "\"}";
	}
	
	
	public static SerializationFormat defaultFotmat(){
		return new SerializationFormat("JSON","");
	}
}
