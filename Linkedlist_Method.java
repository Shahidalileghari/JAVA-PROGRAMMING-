package com.split;

public class Linkedlist_Method {
            Linkedlist_Method next;
            
            int data;
            
            public Linkedlist_Method(int data)
            {
            	this.data=data;
            	
            }
            
          
           
           public boolean search(Node i,int target){
   	        for(Node n=i;n!=null;n=n.next){
   	            if(n.data==target)return true;
   	        }
   	        return false;
   	    }
           
           
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedlist_Method method=new Linkedlist_Method(1);
		
		Linkedlist_Method p=method;
		
		for(int i=2;i<30;i++)
		{
			p.next=new Linkedlist_Method(i*2);
			p=p.next;
			
			
		}
	    
		System.out.println("Linkedlist ");
		for(Linkedlist_Method nd=method;nd!=null;nd=nd.next)
		{
			System.out.print(nd.data+" ");
		}
		
		
	

	}




}
