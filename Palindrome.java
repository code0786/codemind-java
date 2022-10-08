import java.util.*;   
class PalindromeExample2  
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
       
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("True");  
      else  
         System.out.println("False");   
   }  
}  