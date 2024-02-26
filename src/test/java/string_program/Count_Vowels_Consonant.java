package string_program;

public class Count_Vowels_Consonant 
{
	public static void main(String[] args)
	{

		String s="My name is MUJEEB";
		s=s.toLowerCase().replace(" ","" );
		int vowcount=0;
		int conscount=0;
		String ch="";
		String ch1="";
		

		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				vowcount++;
				ch=ch+s.charAt(i);
				
				
			}
			else 
			{
				conscount++;
				ch1=ch1+s.charAt(i);
			}
		}
		
		System.out.println(vowcount+" "+ "vowels");
		System.out.println(ch);
		
		System.out.println(conscount+" "+ "consonant");
		System.out.println(ch1);
			
		

		}
}
