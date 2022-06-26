package com.BasicDataStructure.Assignments;

public class BubbleSortProgram {
	static void bubbleSort(int[] arr) {
	    int size = arr.length;
	    int temp=0;
	    for (int i = 0; i < size - 1; i++)
	    {
	      for (int j = 1; j < (size  - i); j++)
	      {
	        if (arr[j-1] > arr[j]) 
	        {
	          temp = arr[j-1];
	          arr[j-1] = arr[j];
	          arr[j] = temp;
	        }
	  }
	    }
	  }
	  public static void main(String args[]) {
	      
	    int[] arr = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47 };
	    System.out.println("array before sorting");
	    for(int i=0;i<arr.length;i++)
	    {
	    	 System.out.print(arr[i]+ " ");
	    }
	    
	    bubbleSort(arr);
	    System.out.println("array after sorting");
	    for(int i=0;i<arr.length;i++)
	    {
	    	 System.out.print(arr[i]+ " ");
	    }
	  
	  }
	}

