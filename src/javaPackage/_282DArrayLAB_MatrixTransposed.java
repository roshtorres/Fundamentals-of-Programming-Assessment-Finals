package javaPackage;
import java.util.Scanner;

public class _282DArrayLAB_MatrixTransposed 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int rows, cols;
		
		System.out.print("Enter number of rows: ");
		rows = input.nextInt();
		
		System.out.print("Enter number of columns: ");
		cols = input.nextInt();
		
		int [][] num = new int [rows][cols];
		
		//Elements of Matrix
		int c = 1;
		for(int a = 0; a < rows; a++)
		{
			for(int b = 0; b < cols; b++)
			{
				System.out.print("Enter element " + c + ": ");
				num[a][b] = input.nextInt();
				c++;
			}
		}
		
		//Matrix input
		System.out.print("\nMatrix input\n\n");
		for(int a = 0; a < rows; a++)
		{
			for(int b = 0; b < cols; b++)
			{
					System.out.print("\t" + num[a][b]);
			}
			System.out.println();
		}
		
		//Transposed matrix
		System.out.print("\nTransposed matrix\n\n");
		for(int a = 0; a < cols; a++)
		{
			for(int b = 0; b < rows; b++)
			{
					System.out.print("\t" + num[b][a]);
			}
			System.out.println();
		}
	}

}
