package String_Program;

import java.util.Scanner;
import java.util.Scanner;

public class Conversion 
{

  public static void main(String[] args) {
	    int num,dig1,dig2;

	Scanner sc=new Scanner(System.in);
   String str1[]={" ","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
   String str2[]={"","one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"
		   ,"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",
		   "Nineteen"};
   System.out.println("Enter the number between 1 to 99 ");
   num=sc.nextInt();
   if((num<=1)||(num>=100))
   {System.out.println("Wrong input");
}else if((num>=1)&&(num<=19))
{
	System.out.println(str2[num]);
}else if((num>=20)&&(num<=99))
{dig1=num/10;
dig2=num%10;
System.out.println(str1[dig1]+" "+str2[dig2]);
	
}
	
  }

}
