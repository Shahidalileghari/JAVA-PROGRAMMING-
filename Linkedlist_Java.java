package com.split;



class listNode{
	 int data;
	 listNode next;
	 
	 public listNode(int data) {
		 
		this.data=data;
		this.next=null;
	                       }
}

public class Linkedlist_Java {
     public boolean isAscending(Node head)
     {
    	 if(head.next==null || head==null)
    	 
    		 return true;
    		 
    		 for(Node p=head;p.next.next!=null;p=p.next)
    		 {
    			 if(p.data>p.next.data)
    			 
    				 return false;   			 
    		 }
                return true;
              }
     
     public boolean Isdescending(Node head)
     {    if(head==null|| head.next==null)
    	 return true;
     for(Node p=head;p.next.next!=null;p=p.next)
     {if(p.data<p.next.data)
    	 return false;
     }
    	 
    	 return true;
     }
     
    	 public Node insert(Node head, int data)
    	 {
    		 Node n=new Node(data);
    		 n.next=head;
    		 head=n;
    		 
    		 return head;
    	 }
    	 
    	 
    	 public void print(Node head)
    	 {
    		 Node temp=head;
    		 
    		 if(temp!=null)
    		 {
    			 System.out.println(temp.data);
                temp=temp.next;
    		 }
    	 }
    	 
     
	public static void main(String[] args) {
		
          
		listNode node=new listNode(2);
		
		listNode p=node;
		
		for(int i=3;i<21;i++)
		{
			p.next=new listNode(i*2);
			p=p.next;
		}
		
               
         for(listNode g=node;g!=null;g=g.next)
         {
        	 System.out.println(p.data+",");
         }
               
	}

}
