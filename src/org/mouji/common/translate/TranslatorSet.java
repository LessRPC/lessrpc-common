package org.mouji.common.translate;

import java.util.ArrayList;
import java.util.List;

import org.mouji.common.errors.TranslationNotSupportedException;
import org.mouji.common.info.EnvironmentInfo;

/**
 * A set of translators for services
 * 
 * @author Salim
 *
 */
public class TranslatorSet implements Translator {

	private List<Translator> translators;

	@Override
	public void introduce(String classpath1, EnvironmentInfo envInfo1, String classpath2, EnvironmentInfo envInfo2)
			throws TranslationNotSupportedException {
		throw new TranslationNotSupportedException("TranslationSet cannot be introduced to new translations ");
	}

	@Override
	public String translate(String classpath, EnvironmentInfo originEnvInfo, EnvironmentInfo targetEnvInfo) {
		for (Translator translator : translators) {
			String trans = translator.translate(classpath, originEnvInfo, targetEnvInfo);
			if (trans != null) {
				return trans;
			}
		}
		return null;
	}

	@Override
	public boolean canTranslate(String classpath, EnvironmentInfo originEnvInfo, EnvironmentInfo targetEnvInfo) {
		for (Translator translator : translators) {
			boolean flag = translator.canTranslate(classpath, originEnvInfo, targetEnvInfo);
			if (flag) {
				return flag;
			}
		}
		return false;
	}

	public TranslatorSet() {
		translators = new ArrayList<>();
	}

	public List<Translator> getTranslators() {
		return translators;
	}

	public void setTranslators(List<Translator> translators) {
		this.translators = translators;
	}

}
