package javaPackage;
import java.util.Scanner;

public class _15WhileLoopLAB_AlternateReverse 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int number;
		int reverse;
		int a = 1;
		
		System.out.println("Enter number: ");
		number = input.nextInt();
		
		while (number != 0)
		{
			System.out.print(number + " ");
			reverse = number - (number - a);
			System.out.print(reverse + " ");
			a++;
			number--;
		}
	}
	
}