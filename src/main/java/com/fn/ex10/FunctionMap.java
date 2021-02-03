package com.fn.ex10;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionMap<T,R> {
	private Map<String, Function<T, R>> functionMap;
	
	public FunctionMap() {
		functionMap = new HashMap<String, Function<T,R>>();
	}
	
	
	
	public Function<T,R> getFunction(String name){
		Function<T, R> f = null;
		
		if(functionMap.containsKey(name)) {
			f = functionMap.get(name);
		}else {
			throw new InvalidFunctionNameException(name);
		}			
		
		return f;
	}



	public void add(String functionName, Function<T,R> functionObj) {		
		if(functionMap != null && functionMap.containsKey(functionName)) {
			throw new InvalidFunctionNameException("Function "+functionName+" already exist");
		}
		
		functionMap.put(functionName, functionObj);
	}	
	
}
	
