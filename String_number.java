package String_Program;

import java.util.Scanner;

public class String_number {

	public static void main(String[] args)
	{
		String str;
         int n=0;
         //Character c="null";
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your string");
      str=sc.nextLine();
      for (int i = 0; i < str.length(); i++) 
      {
		if(Character.isDigit(str.charAt(i)))
		{
			n++;
			
		}
	}
      System.out.println("No of Digits" +n);
       /* String str = "t23hh";
        int counter = 0;
        int counter2 = 0;
 
        for (int i =0; i < str.length(); i++) {
 
            char c = str.charAt(i);
            Character charc = new Character(c);
 
            if (Character.isDigit(str.charAt(i)))
                counter++;
 
            else
                counter2++;
            }
            ASSS1
 Te5t1n9 5hastr()

5+1+9+5+0
        System.out.println(counter);
        System.out.println(counter2);*/
    

      
	}

}
