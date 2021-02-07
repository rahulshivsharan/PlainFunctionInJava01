package com.fn.ex11;

import java.util.function.Function;

public class SquareFn implements Function<Integer,Integer>{

	@Override
	public Integer apply(Integer value) {
		int num = (value * value);
		return num;
	}

}
