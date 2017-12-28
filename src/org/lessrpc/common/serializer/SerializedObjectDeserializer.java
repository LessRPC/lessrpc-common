package org.lessrpc.common.serializer;

import java.io.IOException;

import org.lessrpc.common.info.SerializedObject;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class SerializedObjectDeserializer extends StdDeserializer<SerializedObject<?>> {

	public SerializedObjectDeserializer(Class<SerializedObject<?>> cls) {
		super(cls);
	}

	public SerializedObjectDeserializer() {
		super(SerializedObject.class);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public SerializedObject<?> deserialize(JsonParser parser, DeserializationContext context)
			throws IOException, JsonProcessingException {

		String classPath = null;
		Object content = null;
		boolean isNull = false;
		while (parser.nextToken() != JsonToken.END_OBJECT) {
			String fieldname = parser.getCurrentName();
			parser.nextToken();
			if (fieldname.toLowerCase().equals("clspath")) {
				classPath = parser.getText();
			} else if (fieldname.toLowerCase().equals("isnull")) {
				isNull = new Boolean(parser.getText()).booleanValue();
			} else if (fieldname.toLowerCase().equals("content")) {
				try {
					if (!isNull) {
						content = parser.readValueAs(Class.forName(classPath));
					} else {
						content = null;
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		if (isNull) {
			return new SerializedObject<>(content, classPath);
		} else {
			return new SerializedObject<>(content);
		}

	}

}
