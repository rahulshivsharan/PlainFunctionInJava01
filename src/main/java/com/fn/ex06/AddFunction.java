package com.fn.ex06;

import java.util.function.IntFunction;

public class AddFunction implements IntFunction<AddFunction.AddNum>{
	
	public AddFunction.AddNum apply(int value) {		
		AddFunction.AddNum addNum = new AddFunction.AddNum(); 
		addNum.add(value);
		return addNum;
	}
	
	/*
	 * Inner class
	 */
	public class AddNum{
		private Integer total;
		
		public AddNum() {
			this.total = 0;
		}
		
		public AddNum add(int num) {
			this.total += num;
			return this;
		}
		
		public Integer getTotal() {
			return this.total;
		}
	}
}
