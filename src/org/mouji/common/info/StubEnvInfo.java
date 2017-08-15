package org.mouji.common.info;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * this class contains environment information for a stub
 * 
 * @author Salim
 *
 */
public class StubEnvInfo {

	/**
	 * Programming Language name and version in the format "token/version"
	 */
	private String lang;

	/**
	 * OS name and version in the format "token/version"
	 */
	private String os;

	/**
	 * Compiler name and version in the format "token/version"
	 */
	private String compiler;

	/**
	 * dummy constructor for RPC
	 */
	public StubEnvInfo() {
	}

	public StubEnvInfo(String lang, String os, String compiler) {
		this.lang = lang;
		this.os = os;
		this.compiler = compiler;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getOS() {
		return os;
	}

	@JsonProperty("os")
	public void setOSName(String os) {
		this.os = os;
	}

	public String getCompiler() {
		return compiler;
	}

	public void setCompiler(String compiler) {
		this.compiler = compiler;
	}

	@JsonIgnore
	public String getOSName() {
		return os.split("/")[0];
	}

	@JsonIgnore
	public String getOSVersion() {
		return os.split("/")[1];
	}

	@JsonIgnore
	public String getLangName() {
		return lang.split("/")[0];
	}

	@JsonIgnore
	public String getLangVersion() {
		return lang.split("/")[1];
	}

	@JsonIgnore
	public String getCompilerName() {
		return lang.split("/")[0];
	}

	@JsonIgnore
	public String getCompilerVersion() {
		return lang.split("/")[1];
	}

	public static StubEnvInfo currentEnvInfo() {
		StubEnvInfo info = new StubEnvInfo();
		info.setLang("JAVA/" + System.getProperty("java.version"));
		info.setOSName(System.getProperty("os.name") + "/" + System.getProperty("os.version"));
		info.setCompiler(System.getProperty("java.vendor") + "/" + System.getProperty("java.version"));
		return info;
	}

	@Override
	public String toString() {
		try {
			return new ObjectMapper(new JsonFactory()).writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof StubEnvInfo)) {
			return false;
		}

		StubEnvInfo info = (StubEnvInfo) obj;
		return (info.getOS() != null && this.getOS() != null && info.getOS().equals(this.getOS()))
				&& (info.getCompiler() != null && this.getCompiler() != null
						&& info.getCompiler().equals(this.getCompiler())
						&& (info.getLang() != null && this.getLang() != null && info.getLang().equals(this.getLang())));

	}
}
