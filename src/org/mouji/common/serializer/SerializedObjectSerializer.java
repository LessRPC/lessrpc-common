package org.mouji.common.serializer;

import java.io.IOException;

import org.mouji.common.info.SerializedObject;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class SerializedObjectSerializer extends StdSerializer<SerializedObject<?>> {

	public SerializedObjectSerializer(Class<SerializedObject<?>> cls) {
		super(cls);
	}

	public SerializedObjectSerializer() {
		super(SerializedObject.class, false);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void serialize(SerializedObject<?> obj, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
		gen.writeStringField("clspath", obj.getClassPath());
		gen.writeBooleanField("isNull", obj.getContent() == null);
		gen.writeObjectField("content", obj.getContent());
		gen.writeEndObject();
	}

}
