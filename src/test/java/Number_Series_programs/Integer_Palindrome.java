package Number_Series_programs;

import org.testng.annotations.Test;

public class Integer_Palindrome
{
	@Test
	public  void Palindrome() 
		{
			int num=121,sum=0,rem=0,temp=num;
			while(num>0)
			{
				rem=num%10;
				sum=(sum*10)+rem;
				num=num/10;
			}
			if(temp==sum)
			{
			System.out.println("its a palindrome"+" "+ sum);
			}
			else
			{
			System.out.println("its not a palindrome"+" "+sum);
			}

		}
	}



