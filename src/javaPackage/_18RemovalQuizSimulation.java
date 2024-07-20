package javaPackage;

public class _18RemovalQuizSimulation 
{
	public static void main(String[] args)
	{
		int x, y, z;
		for(x = 11; x >= 1; x-= 1)
		{
			if((x % 2) != 0 )
			{
				y = 11;
				while(y > x)
				{
					System.out.print("-");
					y -= 2;
				}
				z = 1;
				do
				{
					System.out.print("@");
					z++;
				}while(z <= x);
				System.out.println();
			}
		}
	}

}
