package com.fn.ex04;

import java.util.function.Function;

public class Test01 {

	public static void main(String[] args) {
		Function<Integer,Integer> addFunction = new Function<Integer,Integer>() {
			private int total = 0; 
			public Integer apply(Integer value) {
				this.total += value;
				return this.total;
			}
		}; 
		
		System.out.println(addFunction.apply(3));
		System.out.println(addFunction.apply(4));
		System.out.println(addFunction.apply(5));
		System.out.println(addFunction.apply(10));
	}

}
