package String_Program;

public class FirstCapital {

	public static void main(String[] args) {
		String s = "testing shahstra";
		String s1 = " " + s;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				char ch = Character.toUpperCase(s1.charAt(i + 1));
				s1 = s1.substring(0, i + 1) + ch + s1.substring(i + 2);
			}
		}
		System.out.println(s1);
	}
}