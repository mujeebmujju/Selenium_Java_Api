package Number_Series_programs;

public class Prime_Number 
{
		public static void main(String[] args) 
		{
			int num=7, count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
			System.out.println(num+" "+ "is a prime number");
			}
			else
			{
			System.out.println(num+" "+ "is not a prime number");
			}

		}
	}



