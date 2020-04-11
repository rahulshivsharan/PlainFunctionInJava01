package com.fn.ex09;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example01 {

	private static Double withoutLamda(List<Double> priceList) throws Exception{
		double total = 0.0; // total prices with the discount
		double discountedPrice = 0.0; //Price after discount
		double discountAllowed = 0.91; // 9% discount allowed
		for(Double price : priceList) {
			
			// if price is greater than 50 then that item is qualified for 9% discount.
			if(price > 50) {
				discountedPrice = (price * discountAllowed); // after calculating 9% discount per price
				total += discountedPrice;
			}
		}
		
		return total;
	}
	
	private static Double withLamda(List<Double> priceList) throws Exception{
		double total = 0.00;
		
		total = priceList.stream()
						.filter((price -> price > 50)) // filter out all the prices more than 50
						.map(price -> price * 0.91) // apply 9% discount on all of the filtered numbers
						.reduce(0.0,(price1,price2) -> price1 + price2); // sum all the discounted numbers		
		return total;
	}
	
	
	/*
	 * Using Function api's.
	 * We use stream api and pass Function to each of the methods of stream to get the result
	 */
	private static Double withFunctional(List<Double> priceList) throws Exception{
		double total = 0.00;
		
		/*
		 * Create a filter-function which can be used to pass on to 'filter' method of stream 
		 */
		Predicate<Double> filterPrice = new Predicate<Double>() {
			@Override
			public boolean test(Double price) {				
				return (price > 50);
			}
		};
		
		/*
		 * Create a discount-function which can be passed on to map method of stream
		 */
		Function<Double,Double> applyDiscount = new Function<Double, Double>() {

			@Override
			public Double apply(Double price) {
				Double discount = (9.00/100);
				price = (price - (price * discount));
				return price;
			}
			
		}; 
		
		/*
		BiFunction<Double, Double, Double> sumIt = new BiFunction<Double, Double, Double>() {

			@Override
			public Double apply(Double price1, Double price2) {				
				return (price1 + price2);
			}
			
		}; 
		*/
		
		/*
		 * Create a function which sums two arguments this function instance can be passed to reduce method of stream
		 */
		BinaryOperator<Double> sumIt = new BinaryOperator<Double>() {
			
			@Override
			public Double apply(Double price1, Double price2) {				
				return (price1 + price2);
			}
		};
		
		total = priceList.stream()
						.filter(filterPrice) // filter out all the prices more than 50
						.map(applyDiscount) // apply 9% discount on all of the filtered numbers
						.reduce(0.0,sumIt); // sum all the discounted numbers		
		return total;
	}
	
	
	/*
	 * In this below exercise we demonstrate how to use Lambda expression of Functional classes for calculation
	 * The steps are as follows,
	 * 1.	Accept the list of prices 
	 * 2.	Filter only those prices which are greater that 50.  
	 * 3.	Apply discount to each prices
	 * 4.	Now, get the total of all the discounted prices
	 */
	public static void main(String[] args) {
		List<Double> prices = null;
		try {
			prices = Arrays.<Double>asList(	20.0,
											45.0,
											78.0,
											15.0,
											26.0,
											77.0,
											102.0);
			
			System.out.println("Total Discount with normal method "+withoutLamda(prices));			
			System.out.println("Total Discount with lambda-expression "+withLamda(prices));		
			System.out.println("Total Discount with lambda-expression "+withFunctional(prices));		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
