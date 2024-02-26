package string_program;



import org.testng.annotations.Test;

public class Reverse_String_MoreThan_3Ways
{
	@Test
	public void Reversestring1()
	{
		
		String s="Mujeeb";
		for(int i=s.length()-1;i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
		
		

    @Test
    public void Reversestring2()
    {
		String s="Software";
		char[] ch = s.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}

    }
		
	
    @Test
    public void Reversestring3()
    {
		
		String s="softwares";
		String s1="";
		
		for(int i=0; i<s.length(); i++)
		{
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
	}
    
    
    @Test 
    public void Reversestring4()
    {
		
		String st="softwares";
		char[]s = st.toCharArray();
        int count=0;
        for(char c : s)
		{
			count++;
		}
		
        for(int i=count-1; i>=0; i--)
        System.out.println(s[i]);
	
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}