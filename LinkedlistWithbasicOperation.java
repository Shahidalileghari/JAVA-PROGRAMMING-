package com.split;
      class Nodelink{
    	  int data;
    	  Nodelink next;
    	  
    	  public Nodelink(int data) {
    		  
    		  this.data=data;
			// TODO Auto-generated constructor stub
		}
      }
      
      class lists {
    	  public void traverse(Nodelink head)
    	  {
    		 for(Nodelink p=head;p!=null;p=p.next)
    		 {
    			 System.out.print(p.data+" ");
    			
    		 }
    		 System.out.println(" ");
    	  }
    	  
    	  public Nodelink insert(Nodelink start,Nodelink newNode)
    	  {
    		  if(start==null) return start;
    		  if(start.data>newNode.data)
    		  {
    			  newNode.next=start;
    			  start=newNode;
    			  
    			  return start;
    		  }
    		  for(Nodelink p=start;p!=null;p=p.next)
    		  {
    			  if(p.next==null)
    			  {
    				  p.next=newNode;
    				  newNode.next=null;
    			  }
    		  }
    		 
    		  return start;
    	  }
    	  
    	  public Nodelink delete(Nodelink start,Nodelink newNode)
    	  {
    		  if(start==null) return start;
    		  if(start.next==null)
    		  {
    			  start=null;

    			  return start; 
    			}
    		  
    		  if(start.data==newNode.data)
    		  {
    			  start=start.next;
    		  }
    		  Nodelink p;
    		  
    		  for (p = start; p.next!= null; p = p.next){
                  if(p.next.next== null && p.next.data == newNode.data){
                      p.next = null;
                      
                      return start;
                  }
                 if(newNode.data == p.next.data){
                      p.next = p.next.next;
                     
                      
                      
                  }
              }
    		  
    		  
    		  return start;
    		  }
    	  public int size(Nodelink node)
    	  {
    		  int count=0;
    		  
    		  for(Nodelink p=node;p!=null;p=p.next)
    		  {
    			  count++;
    		  }
    		  
    		  return count;
    	  }
    	  
    	 
      }
public class LinkedlistWithbasicOperation {

	public static void main(String[] args) {
		
		Nodelink node=new Nodelink(12);
		         node.next=new Nodelink(112);
		         node.next.next =new Nodelink(122);
		         node.next.next.next=new Nodelink(132);
		         node.next.next.next.next=new Nodelink(132);
		         node.next.next.next.next.next=new Nodelink(132);
		         node.next.next.next.next.next.next=new Nodelink(132);
		
		         
		lists list=new lists();
		
	
		list.traverse(node);
		
		
//		list.delete(node, node2);
//		list.traverse(node);
//		list.delete(node, node3);
//		list.traverse(node);
		
		
		int size=list.size(node);
		
		System.out.println("Size of linkedlist:"+size);
		

	}

}
