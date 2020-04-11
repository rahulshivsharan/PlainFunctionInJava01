package com.fn.ex05;

import java.util.function.Function;

public class Test01 {

	public static void main(String[] args) {
		
		/*
		 * An add function which adds numbers
		 * which are passed as arguments
		 */
		Function<Integer,Integer> addFunction = new Function<Integer,Integer>() {
			private int total = 0; 
			
			@Override
			public Integer apply(Integer value) {				
				this.total += value; 
				return this.total;
			}
		};
		
		
		
		int finalTotal = addFunction.andThen(addFunction)
									.andThen(addFunction)
									.andThen(addFunction)
									.apply(3);
		
		System.out.println(finalTotal);
	}

}
