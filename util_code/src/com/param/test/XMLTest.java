package com.param.test;

import org.apache.commons.lang.StringEscapeUtils;

public class XMLTest {

	public static void main(String[] args) {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><ingredients></ingredients>";
		
		xml = xml.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
		StringEscapeUtils.escapeXml(xml);
		System.out.println("xml is " + xml); 
	}
}
