 package string_program;

import org.testng.annotations.Test;

public class Happy_Number 
{
	@Test
	public void test()
	{
		int num=568;
		int numc=num;

		boolean flag=true;
		while(flag)
		{
			int sum=0;
			while(num>0)
			{
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			num=sum;
			if(num<9)
			{
				flag=false;
			}
			System.out.println(sum);
		}
		if(num<9)
		{
			System.out.println(numc+" is a happy number");
		}
		else
		{
			System.out.println(numc+" is not a happy number");

		}
	}

}
