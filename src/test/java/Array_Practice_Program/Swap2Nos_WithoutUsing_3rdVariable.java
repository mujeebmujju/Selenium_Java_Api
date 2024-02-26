// SWAP 2 NOS WITHOUT USING 3RD VARIABLE

package Array_Practice_Program;
import org.testng.annotations.Test;

public class Swap2Nos_WithoutUsing_3rdVariable
{
	@Test
	public void swap2numberwithoutusing3rdvariable()
	{
		int a=80;
		int b=40;
		System.out.println("Before swapping a="+a +"  "+ "b="+b);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a="+a +"  "+ "b ="+b);


	}


}