package com.fn.ex08;

import java.util.Arrays;
import java.util.List;

import com.vo.PersonVO;

public class Test02 {
	
	private static void sortByAge(List<PersonVO> personList, boolean ascending) throws Exception{
		personList.sort((employeeOne,employeeTwo) -> (ascending) ? employeeOne.getAge().compareTo(employeeTwo.getAge()) : employeeTwo.getAge().compareTo(employeeOne.getAge()));
		
		personList.forEach((employee) -> System.out.println(employee));
	}

	public static void main(String[] args) {
		List<PersonVO> personList = null;
		boolean inAscendingOrder = false;
		try {
			personList = Arrays.<PersonVO>asList(
					new PersonVO("Ajaykumar Sahay",34, 56000),
					new PersonVO("Sushil Shah",24, 104000),
					new PersonVO("Jyotsana Limaye",37, 90000),
					new PersonVO("Fakiruddin Qasim",25, 10000));
			
			inAscendingOrder = true;
			sortByAge(personList,inAscendingOrder);
			
			System.out.println("\n ------------------------------------ \n");
			
			inAscendingOrder = false;
			sortByAge(personList,inAscendingOrder);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
