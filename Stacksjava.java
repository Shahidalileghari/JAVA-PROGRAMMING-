package com.split;
   


public class Stacksjava {

	public static void main(String[] args) {

		int  arr[]= {1,4,6,54,32,12,8,5092,8,99,76,54,-1,-224342,-3};
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
	
      System.out.println("\nSorting array using selection sort");
      
      for(int i=0;i<arr.length;i++)
      {
    	     for(int j=i+1;j<arr.length;j++)
    	     {
    	    	 if(arr[i]>arr[j])
    	    	 {
    	    		 int temp=0;
    	    		 
    	    		 temp=arr[i];
    	    		 arr[i]=arr[j];
    	    		 
    	    		 arr[j]=temp;
    	    	 }
    	     }
      }
      
      System.out.println("Printing array after sorting using selection sort");
      
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.print(arr[i]+" ");
      }
      
       System.out.println("\nAgain");
       
       for(int i=0;i<arr.length-1;i++)
       {
    	   int index=i;
    	   
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   if(arr[j]<arr[index])
    		   {
    			   int temp=0;
    			   
    			   temp=arr[index];
    			   arr[index]=arr[i];
    			   
    			   arr[i]=temp;
    		   }
    	   }
       }
       
       for(int i=0;i<arr.length;i++)
       {
     	  System.out.print(arr[i]+" ");
       }
      
	}

}
