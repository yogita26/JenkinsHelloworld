package String_Program;

public class String_vowels 
{
	public static void main(String[] args) {
		String s="I love India";
    // String s1=" ";
   for (int i = 0; i <s.length(); i++)
   {
	if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||
s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')
	{
		s=s.substring(0,i)+s.substring(i+1);
	}
}
System.out.println(s);
	}
} 
