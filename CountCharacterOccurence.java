class CountCharacterOccurence
{
    public static void main(String[] args)
    {
        String s = "ss Jyotiprakash sahoo";
 
        //char c = 's';
 
        int count =s.length()-s.replace("s", "").length();
 
        System.out.println("Number of occurances of 's' in "+s+" = "+count);
    }
}