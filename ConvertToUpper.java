package com.vicky.test;

public class ConvertToUpper {

	public static void main(String[] args) {
		String input="jyoti prakash sahoo";
		
		char[] output=input.toCharArray();
		int size=output.length;
		int i=0;
		
		while(i!=size) {
			if(output[i]!=' ') {
			output[i]=(char)(output[i]-32);
			}
			++i;
		}
		System.out.println(input);
		System.out.println(output);

	}

}
