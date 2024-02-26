package string_program;


import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1="Care";
		String s2="Race";
		if(s1.length()==s2.length()) 
		{
			char ch1[]=s1.toLowerCase().toCharArray();
			char ch2[]=s2.toLowerCase().toCharArray();
			Arrays.sort(ch2);
			Arrays.sort(ch1);
			if(Arrays.equals(ch1, ch2)) 
			{
				System.out.println("anagram");
			}
			else 
			{
				System.out.println("not anagram");
			}


		}
		else 
		{
			System.out.println("not anagram");
		}

	}
	
	
}


