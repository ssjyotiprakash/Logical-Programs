package com.test;

import EvenThread.PrintEvenNumber;
import OddThread.PrintOddNumber;

public class ThreadTest  {

	public static void main(String[] args) {
		
		Object object=new Object();
		PrintOddNumber odd=new PrintOddNumber(100,object);
		Thread t=new Thread(odd);
		t.start();
		
		PrintEvenNumber even=new PrintEvenNumber(100,object);
		Thread t1=new Thread(even);
		t1.start();
		

	}

}
