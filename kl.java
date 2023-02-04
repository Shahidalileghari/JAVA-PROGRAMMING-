package com.split;

public class kl{
         
	public boolean find(int arr[], int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				return true;
			}
		}
		
		return false;
	}
		        
	public static void main(String[] args) {
		int arr[]= {21,43,32,21,32,44,55};
		
		int key=-32;
		
		
		kl k=new kl();
		
       System.out.println(k.find(arr, key));
		
		
	}

}
