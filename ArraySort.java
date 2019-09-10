package com.vicky.test;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] a= {2,0,8,5,9,0,75,0,6};
		
		System.out.println(Arrays.toString(a));
		
		int length=a.length;
		int count=0;
		
		for(int i=0;i<length;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
			
			while(count<length) {
				a[count++]=0;
				
			}
			System.out.println(Arrays.toString(a));
		}

	}

