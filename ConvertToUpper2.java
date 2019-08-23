package com.vicky.test;

public class ConvertToUpper2 {

	public static void main(String[] args) {
		String input="jyoti prakash sahoo";
		char[] output=input.toCharArray();
		int size=output.length;
		
		output[0]=(char)(output[0]-32);
		
		
		int i=1;
		while(i!=size) {
			if(output[i]==' ') {
				output[i+1]=(char)(output[i+1]-32);
			}
			++i;
		}
		System.out.println(input);
		System.out.println(output);

	}

}
