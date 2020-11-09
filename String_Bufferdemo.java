package String_Program;

public class String_Bufferdemo {

	public static void main(String[] args)
	{
		String str="Hello";
        char[] allChars=str.toCharArray();
         char[]reverse=new char[allChars.length];
	 System.out.println("Before reverse is: "+str);
     for (int i = 0; i <allChars.length; i++) {
		reverse[i]=allChars[allChars.length-(i+1)];
		
	}
     String rev=new String(reverse);
     System.out.println("After reverse: "+  rev);
	}

}
