package org.lessrpc.common.types;

/**
 * Contains types of serializer
 * 
 * @author Salim
 *
 */
public enum SerializerType {

	AVRO, BSON, CBOR, JSON, MSG_PACK, SMILE, ION, UNKOWN;

	/**
	 * returns the code for the given type
	 * 
	 * @param type
	 * @return
	 */
	public static int toCode(SerializerType type) {
		switch (type) {
		case AVRO:
			return 0;
		case BSON:
			return 1;
		case CBOR:
			return 2;
		case JSON:
			return 3;
		case MSG_PACK:
			return 4;
		case SMILE:
			return 5;
		case ION:
			return 6;
		default:
			return -1;
		}
	}

	/**
	 * returns the code for the current type
	 * 
	 * @return
	 */
	public int getCode() {
		return toCode(this);
	}

	/**
	 * returns a type from assigned code
	 * 
	 * @param code
	 * @return
	 */
	public static SerializerType fromCode(int code) {
		switch (code) {
		case 0:
			return AVRO;
		case 1:
			return BSON;
		case 2:
			return CBOR;
		case 3:
			return JSON;
		case 4:
			return MSG_PACK;
		case 5:
			return SMILE;
		case 6:
			return ION;
		case -1:
			return UNKOWN;
		default:
			return null;

		}
	}

	/**
	 * parses the name of the type to an instance of the enum
	 * 
	 * @param typeStr
	 * @return
	 */
	public static SerializerType parse(String typeStr) {
		switch (typeStr) {
		case "AVRO":
			return AVRO;
		case "BSON":
			return BSON;
		case "CBOR":
			return CBOR;
		case "JSON":
			return JSON;
		case "MSG_PACK":
			return MSG_PACK;
		case "SMILE":
			return SMILE;
		case "ION":
			return ION;
		case "UNKOWN":
			return UNKOWN;
		default:
			return UNKOWN;
		}
	}
}
