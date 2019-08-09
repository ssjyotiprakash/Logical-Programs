import java.util.*;
class PrintNonRetChar 
{
	public static void main(String[] args) 
	{
		String input="abcdefacdef";
		HashMap<Character,Integer> hmap=new HashMap<>();
		for(int i=0;i<input.length();i++){
			Character currentChar=input.charAt(i);
			if(hmap.containsKey(currentChar)==false){
				hmap.put(currentChar,1);
			}else{
				int currentFreq=hmap.get(currentChar);
				currentFreq++;
				hmap.put(currentChar,currentFreq);
			}
		}
		boolean noRepeatingFound=false;
		for(int i=0;i<input.length();i++){
			Character currentChar=input.charAt(i);
			int currentFreq=hmap.get(currentChar);
			if(currentFreq==1){
				System.out.println(currentChar);
				noRepeatingFound=true;
				break;
			}
		}
		if(noRepeatingFound==false){
			System.out.println(-1);
		}

	}
}
