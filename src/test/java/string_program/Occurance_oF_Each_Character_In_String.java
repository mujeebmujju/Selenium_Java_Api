package string_program;

import org.testng.annotations.Test;

public class Occurance_oF_Each_Character_In_String 
{
	@Test
	public void Occurance()
	{
		String s1="Tester";
		String s = s1.toLowerCase(); 
		
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
	     	for(int j=0; j<s.length(); j++)
	     		
//0=0  t==t==> (0>0)--false.--count=1    //1=0  e==t==>!                             //2=0 s!=t 	                     		//3=0 t==t==>  (3>0)--true.--break      //4=0 e!=t                           //5=0 r!=t
//0=1  t!=e==>                           //1=1  e==e==>  (1>1)--false.--count=1      //2=1 s!=e																			//4=1 e==e==>  (4>0)--true.--break   //5=1 r!=e                                         
//0=2  t!=s==>                           //1=2  e!=s==>                              //2=2 s==s==>  (2>2)--false.--count=1                                                                                   //5=2 r!=s
//0=3  t==t==> (0>4)--false.--count=2	 //1=3  e!=t==>  		                     //2=3 s!=t                                                                                                              //5=3 r!=t
//0=4  t!=e==>                           //1=4  e==e==>  (1>5)--false.--count=2      //2=4 s!=e                                                                                                              //5=4 r!=e
//0=5  t!=r==>     		                 //1=5  e!=r==>                              //2=5 s!=r                                                                                                              //5=5 r==r==> (5>5)--false.--count=1
	     		     		
		{
			if(s.charAt(i)==s.charAt(j))
			{
				if(i>j)
				{
					break;
				}
				
				else
				{
					count++;
				}
			}
		}
			
			if(count>=1)
			{
				System.out.print(s.charAt(i)+"="+count);

			}

		}
	}

	}

