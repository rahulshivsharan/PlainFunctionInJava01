package com.fn.ex03;

public class MainTest01 {
	public static void main(String [] args) {
		SumOfNum sum = new SumOfNum();		
		int total = 0; 
		total = sum.apply(new int [] {
				10,100,300
		});
		System.out.println("Total "+total);
		total = sum.apply(new int [] {
				15,35
		});
		System.out.println("Total "+total);
		total = sum.apply(new int [] {
				1,2,3,4,5
		});
		System.out.println("Total "+total);
		total = sum.apply(new int [] {
				200
		});
		System.out.println("Total "+total);
	}
}
