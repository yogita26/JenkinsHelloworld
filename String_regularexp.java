package String_Program;

public class String_regularexp {

	public static void main(String[] args) 
	{
      String s="Te$t!ng $h@$tr@";
      String str=s.replaceAll("[$!@]","x");
      System.out.println(str);
      
      String s1="I Love India";
      String str1=s1.replaceAll("[aeiouAEIOU]"," ");
      System.out.println(str1);
	}

}
