package String_Program;

public class StringAdd_num 
{
	public static void main(String[] args) {
		//char c='3';
		//int i=c;
		String s=new String(" Te5t1n9 5hastr");
		//System.out.println(i);
		//System.out.println(i-48);
		//System.out.println(c);
		int sum=0;
		for (int i = 0; i <s.length(); i++) {
			
		
		if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'
				||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||
				s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||
				s.charAt(i)=='9')
		{
			sum=sum+(s.charAt(i)-48);
		}
		
			/*String a="Te5t1n9 5hastr";
			int sum=0;
			for (int i = 0; i < a.length(); i++) {
				if(Character.isDigit(a.charAt(i)))
				{
					sum=sum+Integer.parseInt(a.charAt(i)+ "");
					
				
			}
		}*/
	}
		System.out.println(sum);
	}
}


