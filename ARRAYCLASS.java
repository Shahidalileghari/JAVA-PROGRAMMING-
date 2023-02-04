
package com.split;


public class ARRAYCLASS {
      
	public int[] PPP(int arr[], int x)
	{
		
		int newarr[]=new int [arr.length+1];
		
		for(int i=0;i<newarr.length;i++)
		{
			newarr[i+1]=arr[i];
		}
		
		newarr[arr.length]=x;
		
		return newarr;
	}
	
	
	
	
       
	public static void main(String[] args) {
		
		
		ARRAYCLASS c=new ARRAYCLASS();
		
		int t=90;
		
		int arr[]= {43,21,34,66,78,9};
		System.out.println(c.PPP(arr, t));
	

	}

}
