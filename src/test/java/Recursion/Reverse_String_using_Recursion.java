package Recursion;

public class Reverse_String_using_Recursion 
{
	public static void main(String[] args) 
	{
		String s="india";
		rev(s,s.length()-1); //india,4
		
	}
	public static void rev(String s,int len) //india,4
	{
		if(len>=0)     
		{
			System.out.print(s.charAt(len)); //a
			len--;
			rev(s,len);//india,4
		}
	}

}
