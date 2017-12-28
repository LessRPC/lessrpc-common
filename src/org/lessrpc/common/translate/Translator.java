package org.lessrpc.common.translate;

import org.lessrpc.common.errors.TranslationNotSupportedException;
import org.lessrpc.common.info.EnvironmentInfo;

/**
 * Translator class contains a map of translation of classpath used for the same
 * SerializedObject but in various environments. For example from java to python
 * 
 * @author Salim
 *
 */
public interface Translator {

	/**
	 * 
	 * Introduces a new translation from one environment info to another
	 * 
	 * @param classPath1
	 * @param envInfo1
	 * @param classPath2
	 * @param envInfo2
	 * @throws TranslationNotSupportedException 
	 */
	public void introduce(String classpath1, EnvironmentInfo envInfo1, String classpath2, EnvironmentInfo envInfo2) throws TranslationNotSupportedException;

	/**
	 * Translates classpath from one environment to another
	 * 
	 * @param classpath
	 * @param originEnvInfo
	 * @param targetEnvInfo
	 * @return
	 */
	public String translate(String classpath, EnvironmentInfo originEnvInfo, EnvironmentInfo targetEnvInfo);
	
	
	/**
	 * Indicates if the Translator can translate classpath from one environment to another
	 * 
	 * @param classpath
	 * @param originEnvInfo
	 * @param targetEnvInfo
	 * @return
	 */
	public boolean canTranslate(String classpath, EnvironmentInfo originEnvInfo, EnvironmentInfo targetEnvInfo);

}
