package com.vicky.test;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a= {5,4,9,45};
		
		int length=a.length;
		int start=0;
		int end=length-1;
		int temp=0;
		
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(a));
			
		}

	

}
