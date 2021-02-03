package com.fn.ex10;


public class Functions {
	public static FunctionMap<Integer, Integer> intFunctionMap() {
		FunctionMap<Integer, Integer> map = new FunctionMap<Integer, Integer>();
		map.add("IncrementByTwo", new AdditionByTwo());
		map.add("MultiplyByFour", new MultiplyByFour());
		map.add("SquareOfNum", new SquareNumber());
		return map;
	}
}
