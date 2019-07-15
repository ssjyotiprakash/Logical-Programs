import java.util.HashSet;
import java.util.Set;
class FindDuplicateElemets 
{
	public static void main(String[] args) 
	{
		int[] arr={5,5,6,7,8,5,9,7};
		Set<Integer> set=new HashSet();
		for(int i=0;i<arr.length;i++){
			if(set.add(arr[i])==false){
				System.out.println("Duplicate Elemets Are::"+ arr[i]);
			}
		}
	}
}