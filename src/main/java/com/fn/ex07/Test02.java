package com.fn.ex07;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test02 {
	
	
	private static void ex01() {
		List<Integer> numList = null;
		SquarOfNum sqrFn = null;
		try {
			numList = Arrays.<Integer>asList(2,4,6,8,10,12,14);
			sqrFn = new SquarOfNum();
			numList.stream().map(sqrFn).forEach((Integer num) -> System.out.println(num));
		}catch(Exception e) {
			throw e;
		}
	}
	
	private static void ex02() {
		List<Integer> numList = null;
		SquarOfNum sqrFn = null;
		try {
			numList = Arrays.<Integer>asList(3,5,7,9,11);
			sqrFn = new SquarOfNum();
			numList.stream().map((num) -> {				
				num *= num;
				return num;				
			}).forEach((Integer num) -> System.out.println(num));
		}catch(Exception e) {
			throw e;
		}
	}
	
	public static void main(String [] args) {		
		try {
			ex01(); // adding squaring function to map
			System.out.println("\n------------------\n");
			ex02(); // writing anonymous Function   
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
