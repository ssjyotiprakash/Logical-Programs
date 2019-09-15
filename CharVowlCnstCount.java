package com.vicky.test;

public class CharVowlCnstCount {

	public static void main(String[] args) {
		String input="SS JYOTI$PRAKASH SAHOO'";
		char[] output=input.toCharArray();
		int size=output.length;
		int conscnt=0;
		int vowcnt=0;
		int splcnt=0;
		int i=0;
		while(i!=size) {
			if(output[i]>='A' && output[i]<='Z') {
				if(output[i]=='A' || output[i]=='E' || output[i]=='I' || output[i]=='O' || output[i]=='U') {
					vowcnt++;
				}else {
					conscnt++;
				}
				
			}else {
				splcnt++;
			}
			i++;
		}
		System.out.println("Consonants:: "+conscnt);
		System.out.println("Vowels:: "+vowcnt);
		System.out.println("Special Characters:: "+splcnt);

	}

}
