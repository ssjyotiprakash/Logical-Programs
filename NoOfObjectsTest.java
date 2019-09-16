package com.vicky.test;

public class NoOfObjectsTest {
		static int noOfObjects=0;
	    public  NoOfObjectsTest(){
		 noOfObjects++;
	   }
	    
	    public static void main(String[] args) {
	    	NoOfObjectsTest n1=new NoOfObjectsTest();
	    	NoOfObjectsTest n2=new NoOfObjectsTest();
	    	NoOfObjectsTest n3=new NoOfObjectsTest();
	    	NoOfObjectsTest n4=new NoOfObjectsTest();
	    	
	    	System.out.println(noOfObjects);
	    	

	}

}
