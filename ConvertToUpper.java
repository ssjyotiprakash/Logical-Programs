
class ConvertToUpper{
   public static void main(String[] args){
     String input="ss jyotiprakash sahoo";
     char[] output=input.toCharArray();
     int size=output.length;
       for(int i=0;i<size;i++){
           output[i]=(char)(output[i]-32);
         }
      System.out.println(input);
      System.out.println(output);
    }
 }
  