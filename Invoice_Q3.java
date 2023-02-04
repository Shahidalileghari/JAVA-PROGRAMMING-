package com.split;
          

         class PrepaareInvoice{
        	
        	 private String partnnumber;
        	 private String partdesription;
        	 
        	 private int quantity;
        	 
        	 private float price;
        	 
        	 float total=0;
        	 
        	 // setters
        	 
        	public void setprice(float price)
        	{
        		this.price=price;
        	}
        	 
        	 public void setpartnumber(String pn)
        	 
        	 {
        		 this.partnnumber=pn;
        	 }
        	 
        	 public void setpartdescription(String pd)
        	 {
        		 this.partdesription=pd;
        	 }
        	 public void setquantit(int q)
        	 {
        		 this.quantity=q;
        	 }
        	 
        	 // getters
        	 
        	public float getprice()
        	{
        		return price;
        	}
        	 
        	 public String getprtnumber()
        	 {
        		 return partnnumber;
        	 }
        	 
        	 public String getprtdescription()
        	 {
        		 return partdesription;
        	 }
        	 
        	 public int getquantity()
        	 {
        		 return quantity;
        	 }
        	 
        	 public float total()
        	 {
        		 if(price==0 && quantity==0)
        		 {
        			 return 0;
        		 }
        		 
        		 total=price*quantity;
        		 
        		 return total;
        	 }
        	 
        	 // display 
        	 
        	 public void display()
        	 {
        		 System.out.println("Price of item :"+this.price);
        		 System.out.println("Part number:"+this.partnnumber);
        		 System.out.println("Part description:"+this.partdesription);
        		 System.out.println("Quantity of item:"+this.quantity);
        		 
        		 
        	 }
        	 
        	 
         }
public class Invoice_Q3 {

	public static void main(String[] args) {
		
		PrepaareInvoice prepaareInvoice=new PrepaareInvoice();
		
		prepaareInvoice.setprice(3400);
		prepaareInvoice.setpartnumber("5");
		prepaareInvoice.setpartdescription("SSD");
		prepaareInvoice.setquantit(3);
		
		prepaareInvoice.display();
		
		System.out.println("Total price :"+prepaareInvoice.total());
	
	}

}
