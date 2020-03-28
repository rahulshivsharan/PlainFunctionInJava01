package com.fn.ex08;

import java.util.Arrays;
import java.util.List;

import com.vo.PersonVO;

public class Test01 {
	
	
	private static void sortByAge(List<PersonVO> personList) throws Exception{
		personList.stream().sorted((p1, p2) -> {
			return p1.getAge().compareTo(p2.getAge());
		}).forEach((PersonVO vo) -> System.out.println(vo));
	}
	
	private static void sortByName(List<PersonVO> personList) throws Exception{
		personList.stream().sorted((p1, p2) -> {
			return p1.getFullName().compareTo(p2.getFullName());
		}).forEach((PersonVO vo) -> System.out.println(vo));
	}
	
	public static void main(String [] args) {
		List<PersonVO> personList = null;
		try {
			personList = Arrays.<PersonVO>asList(
								new PersonVO("Ajaykumar Sahay",34, 56000),
								new PersonVO("Sushil Shah",24, 104000),
								new PersonVO("Jyotsana Limaye",37, 90000),
								new PersonVO("Fakiruddin Qasim",25, 10000)
							);
			sortByAge(personList);
			System.out.println("\n ------------------------------------ \n");
			sortByName(personList);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
