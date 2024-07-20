package javaPackage;
import java.util.Scanner;

public class _19NestedLoopLAB_Matrix 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix to generate (n by n): ");
		int matrix = input.nextInt();

		int rows, columns;
		int answer = 0;
		
		columns = matrix;
		
		for(rows = matrix; rows != 0; rows--)
		{
			do
			{
				if(columns == matrix)
				{
					answer = rows * columns;
				}
				else
				{
					answer = answer - 1;
				}
				System.out.print(answer + "\t");
				columns--;
			}while(columns != 0);
		columns = matrix;
		System.out.println();
		}	
	}
	
}