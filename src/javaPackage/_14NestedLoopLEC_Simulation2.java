package javaPackage;

public class _14NestedLoopLEC_Simulation2 
{
	public static void main(String[] args)
	{
		int a, c;
		
		for(a = 5; a >= 1; a-=1)
		{
			if (a > 5)
			{
				c = 4;
				while (c >= a)
				{
					//Print one space
					System.out.print(" ");
					c = c - 1;
				}
			}
			System.out.println("&");
		}
	}

}
