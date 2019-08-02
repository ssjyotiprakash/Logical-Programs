package com.vicky.test;

@FunctionalInterface
interface Icalculator{
	public Integer add(Integer i,Integer j) ;
}

	

public class LamdaTest {
	public static void main(String[] args) {
		Icalculator calc=(Integer i,Integer j)->{
			return i+j;
		};
		Integer result=calc.add(50,40);
		System.out.println(result);
	}

}
