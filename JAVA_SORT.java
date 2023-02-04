package com.split;

public class JAVA_SORT {
    public void bubbleSort(int arr[])
    {
    	System.out.println("Original array");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    	
    	System.out.println();
    	
  	   for(int i=0;i<arr.length;i++)
  	   {
  		   for(int j=1;j<arr.length-i;j++)
  		   {
  			   if(arr[j-1]>arr[j])
  			   {
  				   int tem=arr[j-1];
  				   
  				   arr[j-1]=arr[j];
  				   
  				   arr[j]=tem;
  			   }
  		   }
  	   }
  	  
  	 
  	  
  	  System.out.println("Sorted array");
  	  
  	  for(int i=0;i<arr.length;i++)
  	  {
  		  System.out.print(arr[i]+" ");
  	  }
  	  System.out.println();
    }
    
    public void SelectionSort(int m[])
    { int index=0;
    int i=0,j=0;
    	for( i=0;i<m.length;i++)
    	{
    		index=i;
    		for( j=i+1;j<m.length-1;i++)
    		{
    			if(m[j]>m[index])
    			{
    				index=j;
    			}
    		}
    	}
    	int tem=m[index];
    	m[index]=m[j];
    	m[j]=tem;
    	
    	for(int a=0;a<m.length;a++)
    	{
    		System.out.print(m[a]+" ");
    	}
    }
	public static void main(String[] args) {
		
		JAVA_SORT sort=new JAVA_SORT();
		
		
		int arr[]= {32,1,54,3,21,67,8};
		System.out.println("Using buble sort");
		sort.bubbleSort(arr);
		System.out.println("\n\n");
		System.out.println("Using selection sort");
		sort.SelectionSort(arr);

	}

}
