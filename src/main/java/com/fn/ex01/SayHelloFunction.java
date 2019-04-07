package com.fn.ex01;

import java.util.function.Function;

public class SayHelloFunction implements Function<String, String> {

	public String apply(String name) {
		StringBuffer strb = new StringBuffer();
		strb.append("Hello \"").append(name).append("\"");
		return strb.toString();
	}

}
