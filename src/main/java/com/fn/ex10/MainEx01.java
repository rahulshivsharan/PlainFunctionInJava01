package com.fn.ex10;

import java.util.HashMap;
import java.util.function.Function;

import javax.print.attribute.HashAttributeSet;

public class MainEx01 {

	public static void main(String[] args) {
		FunctionMap<Integer, Integer> mathFunction =   Functions.intFunctionMap(); 
		
		Function [] fnList = new Function []{
				new Function<Integer, Integer> () {

					@Override
					public Integer apply(Integer num) {				
						return (num + 2);
					}
			
				},
				new Function<Integer, Integer> () {

					@Override
					public Integer apply(Integer num) {				
						return (num * 4);
					}
			
				}
		};
		
				
		mathFunction.add("AddTwo", fnList[0]);
		mathFunction.add("MultTwo", fnList[1]);		
		
		Function<Integer, Integer>  fn = mathFunction.getFunction("MultTwo");
		System.out.println(" Function to multiple by 12 X 4 = "+fn.apply(12));
	}

}
