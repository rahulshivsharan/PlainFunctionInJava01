package com.fn.ex11;

import java.util.function.Consumer;

public class PrintNumber implements Consumer<Integer>{

	@Override
	public void accept(Integer num) {
		System.out.print(num+", ");		
	}
	
}
