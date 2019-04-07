package com.fn.ex01;

public class Test01 {

	public static void main(String[] args) {
		SayHelloFunction obj = new SayHelloFunction();
		String msg = obj.apply("John Smith");
		System.out.println(msg);
	}

}
