package org.mouji.common.serializer;


import java.io.InputStream;
import java.io.OutputStream;

import org.mouji.common.info.SerializationFormat;

import com.fasterxml.jackson.databind.Module;

/**
 * Serializer function requirements
 * 
 * @author Salim
 *
 */
public abstract class Serializer {

	/**
	 * Serializes an object to a specific class
	 * 
	 * @param obj
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	public abstract <T extends Object> byte[] serialize(T obj, Class<T> cls) throws Exception;

	/**
	 * Deserializes a given byte[] to a class
	 * 
	 * @param data
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	public abstract <T extends Object> T deserialize(byte[] data, Class<T> cls) throws Exception;
	
	public abstract <T extends Object> void serialize(T obj, Class<T> cls, OutputStream os) throws Exception;

	/**
	 * Deserializes a given byte[] to a class
	 * 
	 * @param data
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	public abstract <T extends Object> T deserialize(InputStream is, Class<T> cls) throws Exception;

	/**
	 * Returns a serializes initializes with given schema
	 * 
	 * @param schema
	 * @return
	 */
	public abstract Serializer prepare(String schema);

	/**
	 * Returns a Serializes initialized with given module
	 * 
	 * @param module
	 * @return
	 */
	public abstract Serializer prepare(Module module);

	/**
	 * Returns a parses with given module and schema
	 * 
	 * @param module
	 * @param schema
	 * @return
	 */
	public abstract Serializer prepare(Module module, String schema);

	/**
	 * Returns type of serializes
	 * 
	 * @return
	 */
	public abstract SerializationFormat getType();

	@Override
	public int hashCode() {
		SerializationFormat format = getType();
		String key = format.getName() + "/" + format.getVersion();
		return key.hashCode();
	}
	
	public abstract Serializer copy();

}
