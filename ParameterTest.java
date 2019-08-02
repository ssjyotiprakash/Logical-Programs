package com.vicky.test;

@FunctionalInterface
interface Iwelcome{
	public String printMessage(String name); 
}

public class ParameterTest {

	public static void main(String[] args) {
		Iwelcome welcome=(name)->{
			return "Welcome to java:: "+name;
			
		};
		String retVal=welcome.printMessage("vicky");
		System.out.println(retVal);

	}

}
