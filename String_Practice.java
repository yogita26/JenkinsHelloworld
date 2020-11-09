package String_Program;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class String_Practice {

	public static void main(String[] args)
	{
		String str="Hello";
		str.concat("Good morning");
		System.out.println("Conents of string: " +str);
      
		StringBuffer s=new StringBuffer("Hello");
    		   s.append(" Good morning");
    		   System.out.println("contents of StringBuffer: " +s);
    		  
    	StringBuilder sb=new StringBuilder("Hello");
    		sb.append(" Good morning");
    		System.out.println("Contents of stringBuilder: " +sb);
    		char c[]={'H','e','i','o','u'};
		String str1=new String(c);
	System.out.println(str.charAt(1));
	String s1="Testing";
	String t="shastra";
	if(s1.equals(t))
	{
		System.out.println("Strings are equals");
	}
	else
	{
		System.out.println("string are not equal");
	}
	}

}
