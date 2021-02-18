package com.fn.ex12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicate {

	/*
	 * Iterate through the array of string and print non empty strings
	 */
	private static void doIterate() throws Exception{
		List<String> stringList = Arrays.<String>asList("One","Two","","Three","","","Four","Five");
		stringList.stream().forEach(new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				if(t != null && !t.equals("")) {
					System.out.println(t);
				}				
			}
		});
		
	}
	
	/*
	 *  Filtering empty string from list of strings and printing
	 */
	private static void doFilter() throws Exception{
		List<String> stringList = Arrays.<String>asList("One","Two","","Three","","","Four","Five");
		
		stringList.stream().filter(new Predicate<String>() {
			
			@Override
			public boolean test(String t) {				
				return (t != null && !t.equals("")) ? true : false;
			}
		}).collect(Collectors.toList()).forEach(new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		
	}
	
	/*
	 *  Filtering empty string from list of strings and printing, using arrow expressions
	 */
	private static void doFilter2() throws Exception{
		List<String> stringList = Arrays.<String>asList("One","Two","","Three","","","Four","Five");		
		stringList.stream()
					.filter(str -> (str != null && !str.equals("") ? true : false))
					.collect(Collectors.toList())
					.forEach(str -> System.out.println(str));
	}
	
	/*
	 *  Printing the total number of non-empty strings present in the list of strings
	 */
	private static void doCount() throws Exception{
		List<String> stringList = Arrays.<String>asList("One","Two","","Three","","","Four","Five");
		
		int size = stringList.stream().filter(new Predicate<String>() {
			
			@Override
			public boolean test(String t) {				
				return (t != null && !t.equals("")) ? true : false;
			}
		}).collect(Collectors.toList()).size();
		
		System.out.println(size);
	}
	
	/*
	 * Printing the total number of non-empty strings present in the list of strings using arrow expression
	 */
	private static void doCount2() throws Exception{
		List<String> stringList = Arrays.<String>asList("One","Two","","Three","","","Four","Five");
		
		int size = stringList.stream().filter(str -> (str != null && !str.equals("") ? true : false)).collect(Collectors.toList()).size();
		
		System.out.println(size);
	}
	
	
	
	public static void main(String[] args) {		
		try {
			doIterate();
			doFilter();
			doCount();
			doFilter2();
			doCount2();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
