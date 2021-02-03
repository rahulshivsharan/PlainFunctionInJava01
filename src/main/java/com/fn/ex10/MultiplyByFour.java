package com.fn.ex10;

import java.util.function.Function;

public class MultiplyByFour implements Function<Integer,Integer>{

	@Override
	public Integer apply(Integer value) {		 
		return (value * 4);
	}
	
}
