package MOCK_TEST;

import org.testng.annotations.Test;

public class Occurance_oF_Each_Character_In_String 
{
	@Test
	public void Occurance()
	{
		String s1="Welcome";
		String s = s1.toLowerCase(); 
		
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
	     	for(int j=0; j<s.length(); j++)
	     		
//0=0  w==w==> (0>0)--false.--count=1    //1=0  e!=w==>!                             //2=0 l!=w 	                     		//3=0 c!=w==>  						         //4=0 o!=w                                       //5=0 m!=w								//6=0 e!=w
//0=1  w!=e==>                           //1=1  e==e==>  (1>1)--false.--count=1      //2=1 l!=e									//3=1 c!=e									 //4=1 o!=e						                  //5=1 m!=e                                //6=1 e==e==>(6>1)..true.--break        
//0=2  w!=l==>                           //1=2  e!=l==>                              //2=2 l==l==>  (2>2)--false.--count=1      //3=2 c!=l                                   //4=2 o!=l                                       //5=2 m!=l							    
//0=3  w!=c==> 							 //1=3  e!=c==>  		                     //2=3 l!=c                                 //3=3 c==c==> (3>3).--false.--count=1        //4=3 o!=c                                       //5=3 m!=c								
//0=4  w!=o==>                           //1=4  e!=o==>  					         //2=4 l!=o                                 //3=4 c!=o                                   //4=4 o==o==>(4>4).--false.--count=1             //5=4 m!=o								
//0=5  w!=m==>     		                 //1=5  e!=m==>                              //2=5 l!=m                                 //3=5 c!=m                                   //4=5 o!=m                                       //5=5 m==m==> (5>5)--false.--count=1		
//0=6  w!=e==>	     		     		 //1=6  e==e==>  (1>6)--false.--count=2      //2=6 l!=e                                 //3=6 c!=e									 //4=6 o!=e										  //5=6 m!=e								
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
				System.out.print(s.charAt(i) +"="+count +" "+"");

			}

		}
	}

	}

