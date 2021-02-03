package com.fn.ex10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class FunctionsTest {
	
	FunctionMap<Integer, Integer> integerFunction = null;
	
	@BeforeEach
	public void init() {
		integerFunction = Functions.intFunctionMap();
	}

	@Test
	void testSquareFunction() {
		Function<Integer, Integer> fn = integerFunction.getFunction("SquareOfNum");		
		int result = fn.apply(5);
		assertEquals(25, result);
	}

	@Test
	void testMultiplyByFourFunction() {
		Function<Integer, Integer> fn = integerFunction.getFunction("MultiplyByFour");
		int result = fn.apply(8);
		assertEquals(32, result);
	}
	
	@Test
	void testIncrementByTwoFunction() {
		Function<Integer, Integer> fn = integerFunction.getFunction("IncrementByTwo");
		int result = fn.apply(18);
		assertEquals(20, result);
	}
}
