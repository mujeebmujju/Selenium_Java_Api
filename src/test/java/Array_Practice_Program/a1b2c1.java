package Array_Practice_Program;

public class a1b2c1 
{
	public static void main(String[] args) 
	{
		String s="a1b2c1";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				int num = Character.getNumericValue(s.charAt(i+1));
				
				for(int j=0; j<num; j++)
				{
					System.out.print(s.charAt(i));
				}
			}
		}
		
	}

}
