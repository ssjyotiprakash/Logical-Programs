class FindMinElement 
{
	public static void main(String[] args) 
	{
		int[] input={12,7,45,2,0,56};
		int min=input[0];

		System.out.println("Length of the Array is "+input.length);

		for(int i=1;i<input.length;i++){
			if(input[i]<min){
				min=input[i];
			}
		}

		System.out.println("The minimum element is "+min);
	}
}
