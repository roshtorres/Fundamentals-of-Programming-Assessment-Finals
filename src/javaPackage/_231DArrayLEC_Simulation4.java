package javaPackage;

public class _231DArrayLEC_Simulation4 
{
	public static void main(String[] args) 
	{
		int count;
		int[] value = new int[5];
		value[0] = 5;
		
		for(count = 1; count  < value.length; count++)
		{
			value[count] = 5 * count  + 10;
			value[count - 1] = value [count] - 4;
		}
		
		System.out.print("List elements: ");
		for(count = 1; count < value.length; count++)
		{
			System.out.print(value[count] + " ");
		}
		System.out.println();
	}

}
