package String_Program;

public class StringAss1 {

	public static void main(String[] args) {
		String str = "testing shahstra";

		System.out.println("Before converting the string into uppercase " + str);
		str = str.toUpperCase();
		System.out.println("After converting the string into uppercase " + str);
		//System.out.println(str);
		
		String str1 = "testing shastra";
		StringBuilder result = new StringBuilder(str1.length());
		String words[] = str1.split("\\ ");
		for (int i = 0; i < words.length; i++) {

			//result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");

		
result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
System.out.println(result);

	}
	}

}
