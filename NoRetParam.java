package com.vicky.test;

@FunctionalInterface
interface Welcome{
	public void GetMessage();
}

public class NoRetParam {

	public static void main(String[] args) {
		Welcome welcome=()->{
			System.out.println("Welcome to Java");
		};
		welcome.GetMessage();
  
	}

}
