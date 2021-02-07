package com.fn.ex11;

import java.util.Arrays;
import java.util.List;

public class ExTest01 {
	public static void main(String [] args) {
		List<Integer> numList = Arrays.<Integer>asList(2,4,5,8,9);
		
		SquareFn fn = new SquareFn();
		PrintNumber printNum = new PrintNumber(); // Consumer
		
		numList.stream().forEach(printNum);
		System.out.println("\n");
		numList.stream().map(fn).forEach(printNum);
	}
}
