package javaPackage;
import java.util.Scanner;

public class _241DArray_CommonElements 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int sizeOf1stArray = 0, sizeOf2ndArray = 0, sizeOf3rdArray = 0;
		int valueOf1stArray = 0, valueOf2ndArray = 0, valueOf3rdArray = 0;
		
		int[] _1stArray, _2ndArray, _3rdArray;
		
		int a = 0, b = 0, c = 0;
		
		//Size of Array
		System.out.print("Enter size of the 1st Array: ");
		sizeOf1stArray = input.nextInt();
		
		System.out.print("Enter size of the 2nd Array: ");
		sizeOf2ndArray = input.nextInt();
		
		System.out.print("Enter size of the 3rd Array: ");
		sizeOf3rdArray = input.nextInt();
		
		_1stArray = new int[sizeOf1stArray];
		_2ndArray = new int[sizeOf2ndArray];
		_3rdArray = new int[sizeOf3rdArray];
		
		//Value of Array
		System.out.print("Enter value of the 1st Array: ");
		valueOf1stArray = input.nextInt();
		
		System.out.println("Enter value of the 2nd Array: ");
		valueOf2ndArray = input.nextInt();
		
		System.out.println("Enter value of the 3rd Array: ");
		valueOf3rdArray = input.nextInt();
		
		System.out.println("\n\nValue of arrays:\n");
		System.out.println("Array 1: " + valueOf1stArray);
		System.out.println("Array 2: " + valueOf2ndArray);
		System.out.println("Array 3: " + valueOf3rdArray);
		System.out.println("Common elements in sorted arrays: ");
		
		/** for(a = 0; a < _1stArray.length; a++)
		  {
			 for(b = 0; b < _2ndArray.length; b++)
			  {
				 for(c = 0; c < _3rdArray.length; c++)
				 {
					 if(_1stArray[a] == _2ndArray[b] && _2ndArray[b] == _3rdArray[c])
					 {
							System.out.println("Common elements in sorted arrays: " + s1stArray[a]);
					 }
				 }
			  }
		  }*/
		while(a < _1stArray.length && b < _2ndArray.length && c < _3rdArray.length)
		{
			 if(_1stArray[a] == _2ndArray[b] && _2ndArray[b] == _3rdArray[c])
			 {
				 System.out.print(_1stArray[a] + " ");
				 a++;
				 b++;
				 c++;
			 }
			 else if(_1stArray[a] < _2ndArray[b])
			 {
				 a++;
			 }
			 else if(_2ndArray[b] < _3rdArray[c])
			 {
				 b++;
			 }
			 else
			 {
				 c++;
			 } 
		}
	}

}
