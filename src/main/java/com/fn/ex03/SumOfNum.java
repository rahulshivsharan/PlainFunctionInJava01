package com.fn.ex03;

import java.util.function.Function;

public class SumOfNum implements Function<int [],Integer>{

	public Integer apply(int[] numArray) {
		int total = 0;
		for(int i : numArray) {
			total += i;
		}
		return total;
	}
}
