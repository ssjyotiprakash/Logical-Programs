class ReverseNumber{
  public static void main(String[] args){
   int rev=0,rem,no=5432;
   while(no!=0){
      rem=no%10;
      rev=rev*10+rem;
      no=no/10;
   }
  System.out.println(rev);
 }
   
}