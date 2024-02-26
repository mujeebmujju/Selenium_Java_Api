package string_program;
import java.util.LinkedHashSet;
import org.testng.annotations.Test;
public class Assignment_Hashset_String_Programs 
{
	@Test
	public void RevomeRepeatedWordsORUNIQUEInTheString() 
	{
		String s="hi hello hi hello welcome";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();

		for (int i = 0; i < str.length; i++) 
		{
			set.add(str[i]);	
		}
		
		System.out.println("Revome Repeated Words In The String");
		for (String word :set) 
		{
			int count=0;
			for(int  i=0;i<str.length;i++) 
			{
				if(word.equals(str[i]))    
				{
					count++;
				}
			}
			if(count==1)
			{
			
			System.out.println(word+"   "+count);
		}
		}
	}


	@Test
	public void OnlyDuplicatesWords() {
		String s="hi hello hi hello welcome";
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) 
		{
			set.add(str[i]);	
		}
		System.out.println("Only duplicates words");
		for (String word :set) 
		{
			int count=0;
			for(int  i=0;i<str.length;i++) 
			{
				if(word.equals(str[i])) 
				{
					count++;
				}
			}
			if(count>1) 
			{
				System.out.println(word+"   "+count);
			}
		}
	}

	@Test
	public void OrderofOccurenceofEachWords() 
	{
		String s="hi hello hi hello welcome";  
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();

		for (int i = 0; i < str.length; i++) 
		{
			set.add(str[i]);	
		}
		System.out.println("Order of Occurence of Each Word");
		for (String word:set) 
		{
			int count=0;
			for(int  i=0;i<str.length;i++) 
			{
				if(word.equals(str[i]))    
				{
					count++;
				}
			}
			if(count>=1) 
			{
				System.out.println(word+"   "+count+" times");
			}
		}
	}
}