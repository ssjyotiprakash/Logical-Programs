
import java.util.Arrays;
class  ReverseArrayWithoutAnArray
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5,6};
		int start=0;
		int end=a.length-1;
		int middle=a.length/2;

		for(;start<middle;start++,end--){
             int temp=a[start];
			 a[start]=a[end];
			 a[end]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
