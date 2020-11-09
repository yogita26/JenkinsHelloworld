package String_Program;
import java.util.Scanner;

public class StringPaliwithoutre {
  String s;
  int length;
  int counter=0;
      private void gettingString()
      {
    	  System.out.println("Enter the string to check Palindrome");
          Scanner sc=new Scanner(System.in);
          s=sc.nextLine();
          length=s.length();
      }
      private void check()
      {
    	 for (int i = 0; i<length; i++) {
    		 if(s.charAt(i)!=s.charAt((length-1)-i))
    		 counter++;
    		 
			}
    	 if(counter==0)
    	 	 System.out.println("string is Palindrome");
    	 else
    		 System.out.println("String is not palindrome");
      }
	public static void main(String[] args) 
	{
		StringPaliwithoutre sr=new StringPaliwithoutre();

		sr.gettingString();
		sr.check();
		
	}
}
