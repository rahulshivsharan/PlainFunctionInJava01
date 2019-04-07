package com.fn.ex02;

import java.util.function.IntFunction;

public class Test02 {

	public static void main(String[] args) {
		IntFunction<Integer> addByTwo = new IntFunction<Integer>() {
			
			
			public Integer apply(int value) {
				return (2 + value);
			}
		};
		
		System.out.println(" Result "+addByTwo.apply(4));
		System.out.println(" Result "+addByTwo.apply(5));
		System.out.println(" Result "+addByTwo.apply(67));
		System.out.println(" Result "+addByTwo.apply(41));
		System.out.println(" Result "+addByTwo.apply(89));
	}

}
