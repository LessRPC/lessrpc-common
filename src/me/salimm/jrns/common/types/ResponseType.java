package me.salimm.jrns.common.types;

/**
 * 
 * ResponseType enum
 * 
 * @author Salim
 *
 */
public enum ResponseType {

	OK, INPUT_ERROR, SERVER_CRASH, UNKNOWN;

	public static ResponseType parse(String name) {
		if (OK.name().equals(name)) {
			return OK;
		} else if (OK.name().equals(INPUT_ERROR)) {
			return INPUT_ERROR;
		} else if (OK.name().equals(SERVER_CRASH)) {
			return SERVER_CRASH;
		}

		return UNKNOWN;
	}

	public int toCode() {
		return ResponseType.toCode(this);
	}

	public static int toCode(ResponseType type) {
		switch (type) {
		case OK:
			return 0;
		case INPUT_ERROR:
			return 1;
		case SERVER_CRASH:
			return 2;
		case UNKNOWN:
			return -1;
		default:
			break;
		}

		return -1;
	}

	public static ResponseType fromCode(int code) {
		switch (code) {
		case 0:
			return OK;
		case 1:
			return INPUT_ERROR;
		case 2:
			return SERVER_CRASH;
		case -1:
			return UNKNOWN;
		default:
			break;
		}

		return UNKNOWN;
	}

}
