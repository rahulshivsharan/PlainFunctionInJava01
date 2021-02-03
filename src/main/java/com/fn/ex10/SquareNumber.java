package com.fn.ex10;

import java.util.function.Function;

public class SquareNumber implements Function<Integer,Integer>{

	@Override
	public Integer apply(Integer value) {
		value *= value;
		return value;
	}

	

}
