package com.split;

public class GFG {
	
      GFG next;
       
       int data;
       
       GFG (int data)
       {
    	   this.data=data;
       }
       
      
	  

	public static void main(String[] args) {
        
	GFG gfg=new GFG(3);
	
	GFG gfg2=gfg;
	
	
	for(int i=2;i<20;i++)
	{
		gfg2.next=new GFG(i*2);
		
		gfg2=gfg2.next;
		
	}
	
	for(GFG pGfg=gfg;pGfg!=null;pGfg=pGfg.next)
	{
		System.out.print(pGfg.data+",");
	}
	
}
       
	
		
	

	}


