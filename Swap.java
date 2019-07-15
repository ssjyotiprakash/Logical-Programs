class Swap 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		System.out.println("Before Swapping::"+"x="+x+" y="+y);

		x=x+y;//x=10+20=30

		y=x-y;//y=30-20=10

		x=x-y;//x=30-10=20

		System.out.println("After Swapping::"+"x="+x+" y="+y);
	}
}
