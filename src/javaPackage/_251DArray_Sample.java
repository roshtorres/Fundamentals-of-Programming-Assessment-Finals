package javaPackage;
import java.util.Scanner;

public class _251DArray_Sample 
{
	 public static void main(String[] args) 
	 {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter the size of the array 1:");
	      int size1 = sc.nextInt();
	      int[] arrayEx1 = new int[size1];
	      System.out.println("Enter the elements of the array1:");
	  
	      for(int i=0; i<arrayEx1.length; i++) 
	      {
	         arrayEx1[i] = sc.nextInt();
	      }
	      System.out.println("Enter the size of the array 2:");
	      int size2 = sc.nextInt();
	      int[] arrayEx2 = new int[size2];
	      System.out.println("Enter the elements of the array2:");
	      for(int i=0; i<arrayEx2.length; i++) 
	      {
	         arrayEx2[i] = sc.nextInt();
	      }
	      
	  for(int i = 0; i < arrayEx1.length; i++)
	  {
		  for(int j = 0; j < arrayEx2.length; j++)
		  {
			  if(arrayEx1[i] == arrayEx2[j])
			  {
				  System.out.println("The commom element between two arrays is: "+arrayEx1[i]);
				  break;
			  }
		  }
	  }  
	}
	 
}

