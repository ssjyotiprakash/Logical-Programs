class FindMaxElement 
{
	public static void main(String[] args) 
	{
		int[] input={2,5,7,8,19,23};

		int max=input[0];

		for(int i=1;i<input.length;i++){
           if(input[i]>max){
			   max=input[i];
		   }
		}
		
		System.out.println(max);
		}
	}
