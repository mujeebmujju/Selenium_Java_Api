package string_program;

import org.testng.annotations.Test;

public class String_Imp 
{
 @Test
 public void test()
 {
	 String s="aabbabc";
	 int count=1;
	 for(int i=0; i<s.length()-1; i++)
	 {
		 if(s.charAt(i)==s.charAt(i+1))
		 {
			 count++;
		 }
		 else
		 {
			 System.out.print(s.charAt(i)+""+count);
			 count=1;
		 }
		 
	 }
	 System.out.println(s.charAt(s.length()-1)+""+count);
 }
}
  