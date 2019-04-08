package com.fn.ex06;

public class Test01 {
	public static void main(String [] args) {
		AddFunction addFunc = null;
		int total = 0;
		try {
			addFunc = new AddFunction();
			
			total = addFunc.apply(12).add(13).add(1).getTotal();
			System.out.println(total);
			
			total = addFunc.apply(1)
							.add(3)
							.add(5)
							.add(34)
							.getTotal();
			
			System.out.println(total);
			
			total = addFunc.apply(100)
					.add(300)
					.add(500)
					.add(3)
					.getTotal();
	
	System.out.println(total);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
