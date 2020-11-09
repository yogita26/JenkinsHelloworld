package String_Program;

public class String_palindrome {
	public static void main(String[] args) {
		String s = "nitin";
		String rev = "";
		System.out.println(s);
		// char ch[]=s.toCharArray();
		for (int j = s.length() - 1; j >= 0; j--) {
			rev = rev + s.charAt(j);
			// for (int i = 0; i <s.length(); i++)
		}
		if (s.equals(rev)) {
			System.out.println("Given string is palindrome " + s);
		} else {
			System.out.println("Given string is not palindrome " + s);

	}
	}
}

