package javaPackage;
import java.util.Scanner;
import java.text.DecimalFormat;

public class _17LoopWithConditionLAB_Temperature1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		char option;
		double celsius = 0.0, fahrenheit = 0.0;
	
		do
        {
            System.out.println("Main Menu");
            System.out.println("a. Celsius to Fahrenheit");
            System.out.println("b. Fahrenheit to Celsius");
            System.out.println("c. Exit");
            
            System.out.print("\nChoose option [a, b, or c]: ");
    		option = input.next().charAt(0);

            	if (option == 'a' || option == 'A')
            	{
            		System.out.println("Celsius – Fahrenheit Conversion");
            		System.out.print("\nEnter Celsius: ");
            		celsius = input.nextDouble();
            		fahrenheit = 9.0 / 5.0 * celsius + 32.0;
            		System.out.println("\nFahrenheit equivalent is " + df.format(fahrenheit));
            		System.out.println();
            	}
            	else if(option == 'b' || option == 'B')
            	{
            		System.out.println("Fahrenheit - Celsius Conversion");
            		System.out.print("\nEnter Fahrenheit: ");
            		fahrenheit = input.nextDouble();
            		celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
            		System.out.println("\nCelsius equivalent is " + df.format(celsius));
            		System.out.println();
            	}
            	else if(option == 'c' || option == 'C')
            	{
            		System.out.println("\nEnd of program. Good bye!");
            	}  
            	else
            	{
            		System.out.println("Invalid Code");
            	}  
        }while(option == 'a' || option == 'A' || option == 'b' || option == 'B');
	}

}