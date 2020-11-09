package String_Program;

import java.util.Scanner;

public class String_rev 
{

	public static void main(String[] args) 
	{
		/*
		  String s="I Love India"; 
		  char ch[]=s.toCharArray(); 
		  for (int i=s.length()-1;i>=0; i--) 
		  { 
		  System.out.print(ch[i]); }
		 */
		// OR
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		String rev = " ";
		  char ch[]=s1.toCharArray(); 

		for (int i = s1.length()- 1; i>=0; i--) 
		{
			rev =rev+s1.charAt(i);
		}
		System.out.print(rev);

	}


}
