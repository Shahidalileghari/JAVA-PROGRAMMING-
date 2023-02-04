package com.split;

public class Searching {
	
	public int search(int arr[], int x)
	{
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				
				
		return i;
			}
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {4,6,4,22,54,65,3};
    
    int k=22;
    Searching searching=new Searching();
    
            int result=searching.search(arr, k);
            
            if(result>0)
            {
            	System.out.println("Element found at index:"+result);
            }
            
            else {
				System.out.println("Element not found");
			}
	}

}
