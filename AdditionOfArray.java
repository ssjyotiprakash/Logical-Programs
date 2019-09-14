package com.vicky.test;

public class AdditionOfArray {

	public static void main(String[] args) {
		int[] arr= {1,2,5,4,6};
		int length=arr.length;
		int sum=0;
		
		for(int num:arr) {
			sum=num+sum;
		}
		System.out.println(sum);
			
		}

}
