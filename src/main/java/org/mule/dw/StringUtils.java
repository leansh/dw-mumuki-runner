package org.mule.dw;

import org.apache.commons.lang.StringEscapeUtils;

public class StringUtils {

	public static String unescapeXml(String xml){
		return StringEscapeUtils.unescapeXml(xml);
	}
	
}
