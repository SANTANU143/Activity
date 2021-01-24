package JavaActivity4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity1_4 
  {
    static void printArray(int Array[]) 
     {
    	int n=Array.length;
    	for(int i = 0; i<n; i++)
    	{
    		int key=Array[i];
    		int j=i-1;
    		while(j>=0 && key<Array[j])
    		{
    			Array[j+1]=Array[j];
    			j=j-1;
    		}
    		Array[j+1]=key;
    	}
     }
     public static void main(String args[]) 
     {	
    	 int[] data = { 9, 5, 1, 4, 3 };
         ascendingSort(data);
         System.out.println("Sorted Array in Ascending Order: ");
         System.out.println(Arrays.toString(data));
      //int Array[]={ 9, 5, 1, 4, 3 };
      
    
    /*  
      Activity1_4  I_Sort=new Activity1_4 ();
      I_Sort.sort(Array);
      printArray(Array);
      System.out.println(I_Sort);
      */
      
      
      
      
      
    	}
	private static void ascendingSort(int[] data) {
		// TODO Auto-generated method stub
		
	}
	
		
	}
	

