package week1.day2.classroom.arrays;

import java.io.IOException;
import java.util.Arrays;

public class MissingElementInAnArray {
	
	
	public static void main(String[] args) throws IOException
	{
		
		int[] arr = {1,2,3,4,7,6,8};
		System.out.println("The original array is: ");
		for (int i : arr) {
	     System.out.print(i+ " ");
	        }
	        Arrays.sort(arr);
	        System.out.println("\nThe sorted array is: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	}
	        for(int i=0;i<=arr.length;i++)
	        {
	        	int x =arr[i];
	        	System.out.println(x+"");
	        	
	        }
	        
	    

}
}