package Array_Practice_Program;

public class Print_numbers_Contains_1 
{
		public static void main(String[] args)
		{
			String []a = {"12","34","81","21","71"};
			for(int i=0;i<a.length;i++)
			{
				if(a[i].contains("1"))
				{
					System.out.println(a[i] +" contains 1 in it");
				}
			}
			
		}
}


