class RemoveCharacter 
{
	public static void main(String[] args) 
	{
		String text="This - text ! has\\ /alot # of % special % characters";
		text=text.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(text);
	}
}
