package com.split;



class Binary{
        	public int BinarySearchOneD(int array[], int target)
        	{
        		
        		int low = 0;
        	    int high = array.length - 1;
        	    while (low <= high) {
        	        int mid = low + (high - low) / 2;
        	        if (array[mid] == target) {
        	            return mid;
        	        } else if (array[mid] < target) {
        	            low = mid + 1;
        	        } else {
        	            high = mid - 1;
        	        }
        	    }
        	    return -1;
                }
        	
        	
        	 public int  binarySearchtwoD(int[][] array, int target)
        	 {
        		  int low = 0;
        		    int high = array.length - 1;
        		    while (low <= high) {
        		        int mid = low + (high - low) / 2;
        		        if (array[mid][0] <= target && target <= array[mid][1]) {
        		            return mid;
        		        } else if (target < array[mid][0]) {
        		            high = mid - 1;
        		        } else {
        		            low = mid + 1;
        		        }
        		    }
        		    
        		 
        		 return -1;
        	 }
        }
     public class BinarySearch_Q2 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,90,11,23,34};
		
		int key=8;
		
		
		
		Binary binary=new Binary();
		
		int result = 0;
		
		
		long before=System.currentTimeMillis();
		
		binary.BinarySearchOneD(arr, result);
		
		System.out.println(before);
	
		
		
		
		result=binary.BinarySearchOneD(arr, key);
		 System.out.println("Binary search on one dimensional array");
		if(result==-1)
		{
			System.out.println("Element not found:");
		}
		
		else {
		System.out.println("Element found at index :"+result);
		}
		
		int[][] array = {{1, 5}, {6, 8}, {9, 10}};
		int target = 7;
		
		
		int indices = binary.binarySearchtwoD(array, target);
		 System.out.println("\n\nBinary search on two dimensional array");
	 if(indices==-1)
	 {
		 System.out.println("Element not found");
	 }
	 
	 else {
		System.out.println("Element found at index :"+indices);
	}
	}
     }
	


