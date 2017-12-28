package org.lessrpc.common.types;

import org.lessrpc.common.errors.UnderterminableCodeException;

/**
 * 
 * ResponseType enum
 * 
 * @author Salim
 *
 */
public enum StatusType {

	OK, PARSE_ERROR, SERIALIZATION_NOT_SUPPORTED, ARGS_CANNOT_BE_PARSED, SERVICE_NOT_SUPPORTED, CONTENT_TYPE_NOT_SUPPORTED, INVALID_ARGS, ACCEPT_TYPE_NOT_SUPPORTED, INTERNAL_ERROR, SERIALIZATION_ERROR, APPLICATION_SPECIFIC_ERROR, ACCEPT_TYPE_CANNOT_BE_PARSED, CONTENT_TYPE_CANNOT_BE_PARSED, POST_CONTENT_NOT_AVAILABLE, WRONG_HTTP_METHOD, UNKOWN;

	public static StatusType parse(String name) {
		name = name.replace(" ", "_");
		if (OK.name().equals(name)) {
			return OK;
		} else if (PARSE_ERROR.name().equals(name)) {
			return PARSE_ERROR;
		} else if (SERIALIZATION_NOT_SUPPORTED.name().equals(name)) {
			return SERIALIZATION_NOT_SUPPORTED;
		} else if (ARGS_CANNOT_BE_PARSED.name().equals(name)) {
			return ARGS_CANNOT_BE_PARSED;
		} else if (SERVICE_NOT_SUPPORTED.name().equals(name)) {
			return SERVICE_NOT_SUPPORTED;
		} else if (CONTENT_TYPE_NOT_SUPPORTED.name().equals(name)) {
			return CONTENT_TYPE_NOT_SUPPORTED;
		} else if (INVALID_ARGS.name().equals(name)) {
			return INVALID_ARGS;
		} else if (ACCEPT_TYPE_NOT_SUPPORTED.name().equals(name)) {
			return ACCEPT_TYPE_NOT_SUPPORTED;
		} else if (INTERNAL_ERROR.name().equals(name)) {
			return INTERNAL_ERROR;
		} else if (SERIALIZATION_ERROR.name().equals(name)) {
			return SERIALIZATION_ERROR;
		} else if (APPLICATION_SPECIFIC_ERROR.name().equals(name)) {
			return APPLICATION_SPECIFIC_ERROR;
		} else if (CONTENT_TYPE_CANNOT_BE_PARSED.name().equals(name)) {
			return CONTENT_TYPE_CANNOT_BE_PARSED;
		} else if (WRONG_HTTP_METHOD.name().equals(name)) {
			return WRONG_HTTP_METHOD;
		} else if (POST_CONTENT_NOT_AVAILABLE.name().equals(name)) {
			return POST_CONTENT_NOT_AVAILABLE;
		}

		return null;
	}

	public static StatusType fromCode(int code) {
		switch (code) {
		case 1000:
			return OK;
		case 2001:
			return PARSE_ERROR;
		case 2002:
			return SERIALIZATION_NOT_SUPPORTED;
		case 2003:
			return ARGS_CANNOT_BE_PARSED;
		case 2004:
			return SERVICE_NOT_SUPPORTED;
		case 2005:
			return CONTENT_TYPE_NOT_SUPPORTED;
		case 2006:
			return INVALID_ARGS;
		case 2007:
			return ACCEPT_TYPE_NOT_SUPPORTED;
		case 2008:
			return INTERNAL_ERROR;
		case 2009:
			return SERIALIZATION_ERROR;
		case 2010:
			return ACCEPT_TYPE_CANNOT_BE_PARSED;
		case 2011:
			return CONTENT_TYPE_CANNOT_BE_PARSED;
		case 2012:
			return POST_CONTENT_NOT_AVAILABLE;
		case 2013:
			return WRONG_HTTP_METHOD;
		default:
			if (code >= 3000 && code < 4000)
				return APPLICATION_SPECIFIC_ERROR;
			else
				return UNKOWN;

		}
	}

	public int toCode() throws UnderterminableCodeException {
		switch (this) {
		case OK:
			return 1000;
		case PARSE_ERROR:
			return 2001;
		case SERIALIZATION_NOT_SUPPORTED:
			return 2002;
		case ARGS_CANNOT_BE_PARSED:
			return 2003;
		case SERVICE_NOT_SUPPORTED:
			return 2004;
		case CONTENT_TYPE_NOT_SUPPORTED:
			return 2005;
		case INVALID_ARGS:
			return 2006;
		case ACCEPT_TYPE_NOT_SUPPORTED:
			return 2007;
		case INTERNAL_ERROR:
			return 2008;
		case SERIALIZATION_ERROR:
			return 2009;
		case ACCEPT_TYPE_CANNOT_BE_PARSED:
			return 2010;
		case CONTENT_TYPE_CANNOT_BE_PARSED:
			return 2011;
		case POST_CONTENT_NOT_AVAILABLE:
			return 2012;
		case WRONG_HTTP_METHOD:
			return 2013;
		default:
			throw new UnderterminableCodeException();

		}
	}

	public int httpMatchingStatus() {
		switch (this) {
		case OK:
			return 200;
		case PARSE_ERROR:
			return 400;
		case SERIALIZATION_NOT_SUPPORTED:
			return 400;
		case ARGS_CANNOT_BE_PARSED:
			return 400;
		case SERVICE_NOT_SUPPORTED:
			return 405;
		case CONTENT_TYPE_NOT_SUPPORTED:
			return 400;
		case INVALID_ARGS:
			return 400;
		case ACCEPT_TYPE_NOT_SUPPORTED:
			return 406;
		case INTERNAL_ERROR:
			return 500;
		case SERIALIZATION_ERROR:
			return 500;
		case ACCEPT_TYPE_CANNOT_BE_PARSED:
			return 400;
		case CONTENT_TYPE_CANNOT_BE_PARSED:
			return 400;
		case POST_CONTENT_NOT_AVAILABLE:
			return 400;
		case WRONG_HTTP_METHOD:
			return 400;
		default:
			return 500;
		}
	}

}
