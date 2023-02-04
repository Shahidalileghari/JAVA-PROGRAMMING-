package com.split;
     class TestArray{
    	 int  sum=0;
		 int sum1=0;
		 int sum2=0;
    	 
    	 public int sum(int arr1[], int arr2[])
    	 {
    		
    		 int l1=arr1.length;
    		 int l2=arr2.length;
    		for(int i=0;i<l1;i++)
    		{
    			sum1+=arr1[i];
    		}
    		
    		for(int j=0;j<l2;j++)
    		{
    			sum2+=arr2[j];
    		}
    		 sum=sum1+sum2;
    		 return sum;
    	 }
    	 
    	 public void highestNumber( int arr1[], int arr2[])
    	 {   int max1;
    	      max1=arr1[0];
    	      int max2;
    	     
    	      max2=arr2[0];
    		 for(int i=0;i<arr1.length;i++)
    		 {
                if(max1<arr1[i])
                {
                	max1=arr1[i];
                }
    		 }
    		 
    		 for(int j=0;j<arr2.length;j++)
    		 {
    			 if(max2<arr2[j])
    			 {
    				max2 =arr2[j];
    				 
    				 
    			 }
    		 }

			 System.out.println(" max2  :"+max2);
			 System.out.println(" max1  :"+max1);
    		 
 
    			 
    	 }
    	 
     }
    public class Test {
        
	public static void main(String[] args) {
		int arr1[]= {5,7,9,11};
   	    int arr2[]= {29,35,45};
   	 
   	 TestArray testArray=new TestArray();
   	 
   	 int result=testArray.sum(arr1, arr2);
   	 
   	 System.out.println("Sum of array :"+result);
   	 
   	 testArray.highestNumber(arr1, arr2);

	}

    }
