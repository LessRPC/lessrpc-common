package org.lessrpc.common.types;

public enum StubLangType {
	JAVA, PYTHON, R, UNKOWN;

	public int getCode() {
		if (this.equals(JAVA)) {
			return 0;
		} else if (this.equals(PYTHON)) {
			return 1;
		} else if (this.equals(R)) {
			return 2;
		}
		return -1;
	}

	public StubLangType parse(int code) {
		switch (code) {
		case 0:
			return JAVA;
		case 1:
			return PYTHON;
		case 2:
			return R;
		default:
			break;
		}

		return UNKOWN;
	}
}
