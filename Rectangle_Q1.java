package com.split;


     class Rectangle1{
    	 private float length;
    	 private float width;
    	 private float area;
    	 private float perimeter;
    	 
    	 
    	 
    	 public void setlenght(float width)
    	 {
    		 this.width=width;
    	 }
    	 public void setwidth(float length)
    	 {
    		 this.length=length;
    	 }
    	 
    	 
    	 public float getwidth()
    	 {
    		 if(width>0.0 && width<20.0)
    			 
    		 {
    			 return width;
    		 }
    		 
    		 return 0;
    	 }
    	 
    	 public float getlength()
    	 {
    		 if(length>0.0 && length<20.0)
    			 
    		 {
    			 return length;
    		 }
    		 
    		 return 0;
    	 }
    	 
    	 
    	 public float calarea()
    	 {
    		 area=(float) (0.5*width*length);
    		 
    		 
    		 return area;
    	 }
    	 
    	 public float calperimeter()
    	 {
    		 perimeter=2*(width+length);
    		 
    		 
    		 return perimeter;
    	 }
    	 
    	 
    	 public void display()
    	 {
    		 System.out.println("\n Area of this rectangle is     :"+this.calarea()+" sq unit");
    		 System.out.println("  Perimeter of this rectangle is:"+this.calperimeter()+" unit");
       	 }
    	 
    	 
     }
       public class Rectangle_Q1 {

	  public static void main(String[] args) {
		
		
		Rectangle1 rectangle1=new Rectangle1();
		
		rectangle1.setlenght(12);
		rectangle1.setwidth(19);
		
		
		rectangle1.display();
		

	}

}
