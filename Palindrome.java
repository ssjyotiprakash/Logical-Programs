class Palindrome
{
	public static void main(String[] args) 
	{
		String input="iti";
		System.out.println("The original input is:: "+input);
		String reverse="";
		for(int i=input.length()-1;i>=0;i--){
			reverse=reverse+input.charAt(i);
		}
		if(input.equals(reverse)){
			System.out.println("The input is palindrome");
	}
	else{
		System.out.println("The input is not palindrome");
	}
}
}
	
