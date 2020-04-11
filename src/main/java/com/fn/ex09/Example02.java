package com.fn.ex09;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example02 {

	private static void iterateOne(List<String> movieList) {
		Consumer<String> printConsumer = new Consumer<String>() {

			@Override
			public void accept(String movieName) {				
				System.out.println("Fav movie is [\""+movieName+"\"]");
			}
			
		};
		movieList.forEach(printConsumer);
	}
	
	
	private static void iterateTwo(List<String> movieList) {
		movieList.forEach((final String movieName) -> System.out.println("Favorite movie is [\""+movieName+"\"]"));
	}
	
	private static void iterateThree(List<String> movieList) {
		movieList.forEach((movieName) -> System.out.println("[Favorite] movie is [\""+movieName+"\"]"));
	}
	
	private static void iterateFour(List<String> movieList) {
		movieList.forEach(movieName -> System.out.println("movie is [\""+movieName+"\"]"));
	}
	
	private static void iterateFive(List<String> movieList) {
		movieList.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		List<String> movieList = Arrays.<String>asList(	"Iron Man",
														"X Men",
														"Superman",
														"Spiderman",
														"Hitman",
														"Batman",
														"Aquaman");
		iterateOne(movieList);
		iterateTwo(movieList);
		iterateThree(movieList);
		iterateFour(movieList);
		iterateFive(movieList);
	}

}
