package com.fn.ex07;

import java.util.function.Function;

public class SquarOfNum implements Function<Integer, Integer>{

	
	public Integer apply(Integer num) {
		num *= num;
		return num;
	}
	
}
