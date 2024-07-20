package javaPackage;

public class _272DArrayLEC_Simulation 
{
	public static void main(String[] args) 
	{
		int row, col;
		int[][] num = new int[4][4];
		int number = 4;
		
		for(row = 0; row < num.length; row++)
		{
			for(col = 0; col < num[row].length; col++)
			{
				num[row][col] = number;
				number--;
			}
			number+=5;
		}
		
		for(int m = num.length - 1; m >= 0; m--)
		{
			for(int n = 0; n < num[m].length; n++)
			{
				System.out.print(num[m][n] + "\t");
			}
			System.out.println();
		}
	}

}
