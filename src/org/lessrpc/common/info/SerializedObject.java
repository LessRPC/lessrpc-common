	package org.lessrpc.common.info;

import org.lessrpc.common.serializer.SerializedObjectDeserializer;
import org.lessrpc.common.serializer.SerializedObjectSerializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * 
 * <h5>Serialized Object</h5>
 * 
 * <p>
 * SerializedObject object contains the following fields:
 * </p>
 * <ul style="list-style-type: circle; margin-left: 3em;">
 * <li><strong>clspath*: </strong>Class path for the object which depends to the
 * client environment. It will be using class path in Java and Python but it can
 * contain any information necessary to parse an instance of the serialized
 * object</li>
 * <li><strong>content*: </strong>Serialized data for object</li>
 * </ul>
 * <br/>
 * 
 * @author Salim
 *
 */
@JsonSerialize(using = SerializedObjectSerializer.class)
@JsonDeserialize(using = SerializedObjectDeserializer.class)
public class SerializedObject<T> {

	/**
	 * content object
	 */
	private T content;

	/**
	 * class path information for deserializing object
	 */
	private String classPath;

	public SerializedObject(T obj) {

		this.classPath = obj.getClass().getName();
		content = obj;
	}

	public SerializedObject(T obj, String clsPath) {

		this.classPath = clsPath;
		content = obj;
	}

	/**
	 * dummy constructor for RPC
	 */
	public SerializedObject() {
	}

	public String getClassPath() {
		return classPath;
	}

	public void setClassPath(String clspath) {
		this.classPath = clspath;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
		this.classPath = content.getClass().getName();
	}

	@Override
	public String toString() {
		return "{SerializedObject clspath: " + classPath + " }";
	}

}
