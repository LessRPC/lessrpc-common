package me.salimm.jrns.common.types;

/**
 * 
 * ResponseType enum
 * 
 * @author Salim
 *
 */
public enum StatusType {

	OK, INPUT_ERROR, SERVER_CRASH, CLIENT_STUB_TYPE_NOT_SUPPORTED, UNKNOWN;

	public static StatusType parse(String name) {
		if (OK.name().equals(name)) {
			return OK;
		} else if (INPUT_ERROR.name().equals(name)) {
			return INPUT_ERROR;
		} else if (SERVER_CRASH.name().equals(name)) {
			return SERVER_CRASH;
		} else if (CLIENT_STUB_TYPE_NOT_SUPPORTED.name().equals(name)) {
			return CLIENT_STUB_TYPE_NOT_SUPPORTED;
		}

		return UNKNOWN;
	}

	public int toCode() {
		return StatusType.toCode(this);
	}

	public static int toCode(StatusType type) {
		switch (type) {
		case OK:
			return 0;
		case INPUT_ERROR:
			return 1;
		case SERVER_CRASH:
			return 2;
		case CLIENT_STUB_TYPE_NOT_SUPPORTED:
			return 3;
		case UNKNOWN:
			return -1;
		default:
			break;
		}

		return -1;
	}

	public static StatusType fromCode(int code) {
		switch (code) {
		case 0:
			return OK;
		case 1:
			return INPUT_ERROR;
		case 2:
			return SERVER_CRASH;
		case 3:
			return CLIENT_STUB_TYPE_NOT_SUPPORTED;
		case -1:
			return UNKNOWN;
		default:
			break;
		}

		return UNKNOWN;
	}

}
