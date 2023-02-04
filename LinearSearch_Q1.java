package com.split;



class ArraySearch{
        	   public static int searchoneD(int arr[], int key)
        		{
        			for(int i=0;i<arr.length;i++)
        			{
                                if(arr[i]==key)
        					   {
        						   
                                	return i;
        					   }
        				   
        			}
        			
        			return -1;
        		}
        	   
        	   public static int  searchtwoD(int arr[][], int key)
        	   {

        		   
        		
        		      
        		      for(int i=0;i<arr.length;i++)
        		      {
        		    	  for(int j=0;j<arr[i].length;j++)
        		    	  {
        		    		  if(arr[i][j]==key)
        		    		  {
        		    			  return 1;
        		    		  }
        		    	  }
        		      }
        		   
        		   
        		   return -1;
        	   }
        	   
           }
public class LinearSearch_Q1 {
	
	

	public static void main(String[] args) {
		
		int key=8;
		
		int arr[]= {1,2,3,4,5,6,7,7,8,7};
		
		ArraySearch search=new ArraySearch();
		
	    int result=search.searchoneD(arr, key);
		
	    System.out.println("Linear search on one dimensioanl array");
		if(result>0)
		{
			System.out.println("Element found at index :"+result);
		}
		
		else {
			System.out.println("Element not found");
		}
		
		
		int arr2[][]= {{21,4},{32,21},{5,23}};
		
		int key2=32;
		System.out.println("\n\nLinear search on two dimensioanl array");
	 int  result2=  search.searchtwoD(arr2, key2);
	 
	    if(result2>0)
	    {
	    	System.out.println("Element found :"+result2);
	    }
         else {
			System.out.println("Element not found");
		}
	}
	


}
