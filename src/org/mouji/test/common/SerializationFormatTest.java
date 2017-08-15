package org.mouji.test.common;

import org.junit.Test;
import org.mouji.common.errors.SerializationFormatHTTPNotParsable;
import org.mouji.common.info.SerializationFormat;

import static org.junit.Assert.*;

public class SerializationFormatTest {

	@Test
	public void testHTTPFormat() {
		SerializationFormat format = new SerializationFormat("test", "1.2.3");
		assertEquals(format.httpFormat(),
				"application/vnd.less ;lessversion=\"beta\" ; format=\"test\" ; formatversion=\"1.2.3\"");

	}

	@Test
	public void testParseHTTPFormat() throws SerializationFormatHTTPNotParsable {
		SerializationFormat format = new SerializationFormat("test", "1.2.3");
		assertEquals(format, SerializationFormat.parseHTTPFormat(
				"application/vnd.less ;lessversion=\"beta\" ; format=\"test\" ; formatversion=\"1.2.3\""));
	}

	@Test
	public void testParseHTTPFormatWithSpaces() throws SerializationFormatHTTPNotParsable {
		SerializationFormat format = new SerializationFormat("test", "1.2.3");
		assertEquals(format, SerializationFormat.parseHTTPFormat(
				"application/vnd.less ;lessversion=\"beta\"     ; 		format=\"test\" ; 					formatversion=\"1.2.3\""));
	}

}
