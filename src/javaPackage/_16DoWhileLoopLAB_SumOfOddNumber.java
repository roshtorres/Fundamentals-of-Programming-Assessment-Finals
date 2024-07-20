package javaPackage;
import java.util.Scanner;

public class _16DoWhileLoopLAB_SumOfOddNumber 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	      
    	int num = 1;
    	int n = 1; 
    	int sum = 1;
    	
        System.out.print("Enter number: ");
		int number = input.nextInt();
		
		System.out.print("\nOdd numbers are: ");
		
		do
		{
			System.out.print(num + " ");
			n+=1;
			num+=2;
			if(n <= number)
			{
				sum+=num;
			}
		}while(n <= number);
		System.out.println("\nThe sum of odd numbers up to  " + number + " term is " + sum);
    }
    
}