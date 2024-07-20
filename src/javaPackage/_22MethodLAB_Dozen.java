package javaPackage;
import java.util.Scanner;

public class _22MethodLAB_Dozen 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numberOfEggs = 0;
		
		System.out.println("Enter the number of eggs: ");
		numberOfEggs = input.nextInt();
		
		System.out.println("Number of dozen: " + determineDozen(numberOfEggs));
		System.out.println("Eggs less than a dozen:  " + showLessDozen(numberOfEggs));
	}
	
	public static int determineDozen(int eggs)
	{
		int numberOfDozen = 0;
		
		numberOfDozen = eggs / 12;
		
		return numberOfDozen;
	}
	
	public static int showLessDozen(int eggs)
	{
		int dozen = determineDozen(eggs);
		int eggsLessDozen = 0;
		
		eggsLessDozen = (eggs - (dozen * 12));
		
		return eggsLessDozen;
	}

}
