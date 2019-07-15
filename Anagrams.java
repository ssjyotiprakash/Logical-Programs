import java.util.Arrays;
class Anagrams 
{
	public static void main(String[] args) 
	{

		String s1="keeps";
		String s2="peek";

		if(s1.length()!=s2.length()){
            System.out.println("Both the Strings are not anagrams");
			System.exit(1);
		}

			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean flag=Arrays.equals(ch1,ch2);
			if(flag==true){
				System.out.println("Both the strings are anagrams");
			}else{
		System.out.println("Both the strings are not anagrams");
			}
	}
}
