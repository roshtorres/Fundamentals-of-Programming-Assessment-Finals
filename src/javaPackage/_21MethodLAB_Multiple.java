package javaPackage;

import java.util.Scanner;

public class _21MethodLAB_Multiple 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	
		int firstInteger = 0;
		int secondInteger = 0;
		
		System.out.print("Enter first integer: ");
		firstInteger= input.nextInt();

		System.out.print("Enter second integer: ");
		secondInteger = input.nextInt();
		
		if(isMultiple(firstInteger, secondInteger))
		{
			System.out.println(secondInteger + " is multiple of " + firstInteger);
		}
		else
		{
			System.out.println(secondInteger + " is not multiple of " + firstInteger);
		}
	}
		
		public static boolean isMultiple(int first, int second)
		{
			if((second % first) == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
}