import java.util.Arrays;
class ReverseStringWoExtra 
{
	public static void main(String[] args) 
	{
		String name="Vicky";
		System.out.println("Before reverse of the name is:: "+name);
		
		char[] cname=name.toCharArray();
		int length=cname.length;
    for(int i=length-1;i>=0;i--){
		System.out.print(cname[i]);
	}
	}
}
