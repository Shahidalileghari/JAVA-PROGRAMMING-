


package com.split;



public class Split {
	   int rever1,rever,rever2;
	 int remainder;
         public int reverse(int number)
         {
        	 while(number>0)
        	 {
        		 
        		 remainder=number%10;
        		 rever=rever*10+remainder;
        		 
        		 number/=10;
        			
        		 
        		
        	 }
        	 
        	 return rever;
       
         }
         
         public int sum(int number)
         {
        	    while(number>0)
        	    {
        	 rever1=rever1+number%10;
        	 number=number/10;
        	 
        	    }
        	    
        	    return  rever1;
         }
         
         public int product(int number)
         {
        	    while(number>0)
        	    {
        	 rever2=rever2*(number%10);
        	 number=number/10;
        	 
        	    }
        	    
        	    return  rever1;
         }
         
         public int add(int x , int y)
         {
        	 return x+y;
         }
	public static void main(String[] args) {

	  Split split=new Split();
	  
	  int x=1234;
	  System.out.println("Original number:"+x);
	  System.out.println("Reversed number:"+split.reverse(x));
	  System.out.println("Sum of numbers:"+split.sum(x));
	  
	  System.out.println("Addition of numbers :"+split.add(x, x));
	  
	  System.out.println("Multiplication of numbers:"+split.sum(x));
	}

}
