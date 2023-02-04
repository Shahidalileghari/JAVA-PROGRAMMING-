package com.split;
 class   Node{
	 
	 Node next;
	 
	 int data;
	 
	 
	 public Node(int data) {
		// TODO Auto-generated constructor stub
		 
		 
		 this.data=data;
	}
	    
 }

  class list {
	  
	  public boolean isAscending(Node head){
	        if(head==null||head.next==null)return true;
	        for(Node n=head;n.next.next!=null;n=n.next) if(n.data>n.next.data)return false;
	        return true;
	    }
	    public boolean isDescending(Node head){
	        if(head==null||head.next==null)return true;
	        for(Node n=head;n.next.next!=null;n=n.next)if(n.data<n.next.data)return false;
	        return true;
	    }
	    public boolean isSorted(Node head){
	        return isAscending(head)||isDescending(head);
	    }
	    public int size(Node head){
	        if(head==null)return 0;
	        Node temp=head;
	        int count=1;
	        while (temp.next!=null){
	            temp=temp.next;
	            count++;
	        }
	        return count;
	    }
	    public void traverse(Node head){
	        Node temp=head;
	        while (temp!=null){
	            System.out.print(temp.data+" ");
	            temp=temp.next;
	        }
	        System.out.println();
	    }
	    public Node insertAtBeginning(Node head,int data){
	        Node n=new Node(data);
	        n.next=head;
	        head=n;
	        return head;
	    }
	    public Node insertAtEnd(Node head,int data){
	        Node n=new Node(data);
	        if(head==null)return n;
	        Node temp=head;
	            while (temp.next!=null){
	                temp=temp.next;
	            }
	            temp.next=n;
	        return head;
	    }
	    public Node insertAtMid(Node head,int data){
	        Node n=new Node(data);
	        int mid=(2+size(head))/2;
	        if(mid==1)head=insertAtBeginning(head,data);
	        else {
	            Node temp = head;
	            for (int i = mid; i > 2; i--) {
	                temp = temp.next;
	            }
	            n.next = temp.next;
	            temp.next = n;
	        }
	        return head;
	    }
	    public Node insertAtSpecificPosition(Node head,int data,int position){
	        int size=size(head);
	        if(position<1||position>(size+1))throw new IllegalArgumentException("Position must be from 1 to "+(size+1));
	        if(position==1) head=insertAtBeginning(head,data);
	        else {
	            Node n=new Node(data);
	            Node temp=head;
	            for(int i=2;i<position;i++){
	                temp=temp.next;
	            }
	            n.next=temp.next;
	            temp.next=n;
	        }
	        return head;
	    }
	    public Node insert(Node head,int data){
	        if(!isSorted(head))throw new IllegalArgumentException("Linked List must be sorted");
	        Node n=new Node(data);
	        if(isAscending(head)){
	            if(head.data>data)head=insertAtBeginning(head,data);
	            else {
	                Node temp;
	                for(temp=head;temp.next!=null;temp=temp.next){
	                    if(temp.next.data>data)break;
	                }
	                n.next=temp.next;
	                temp.next=n;
	            }
	        }
	        else {
	            if(data>head.data)head=insertAtBeginning(head,data);
	            else {
	                Node temp;
	                for(temp=head; temp.next!=null;temp=temp.next){
	                    if(data> temp.next.data)break;
	                }
	                n.next=temp.next;
	                temp.next=n;
	            }
	        }
	        return head;
	    }
	    public Node deleteFirstNode(Node head){
	        if(head==null||head.next==null)return null;
	        return head.next;
	    }
	    public Node deleteMiddleNode(Node head){
	        if(head==null||head.next==null)return null;
	        if(head.next.next==null)return head.next;
	        int mid=(1+size(head))/2;
	        Node temp=head;
	        for(int i=mid;i>2;i--){
	            temp=temp.next;
	        }
	        temp.next=temp.next.next;
	        return head;
	    }
	    public Node deleteLastNode(Node head){
	        if(head==null||head.next==null)return null;
	        Node temp=head;
	        while (temp.next.next!=null){
	            temp=temp.next;
	        }
	        temp.next=null;
	        return head;
	    }
	    public Node deleteSpecificNode(Node head,int position){
	        if(head==null)throw new IllegalArgumentException("LinkedList does not exist");
	        if(position<1||position>(size(head)))throw new IllegalArgumentException("Position must be from 1 to "+size(head));
	        if(position==1)return head.next;
	        Node temp=head;
	        for(int i=position;i>2;i--){
	            temp=temp.next;
	        }
	        temp.next=temp.next.next;
	        return head;
	    }
	    public Node delete(Node head,int target){
	        if(head==null)return null;
	        if(head.data==target)return head.next;
	        Node n;
	        for(n=head;n.next!=null;n=n.next){
	            if(n.next.data==target){
	                n.next=n.next.next;
	                break;
	            }
	        }
	        return head;
	    }
	    public void update(Node head,int target,int replacement){
	        for(Node n=head;n!=null;n=n.next){
	            if(n.data==target){
	                n.data=replacement;
	                return;
	            }
	        }
	    }
	    public boolean search(Node head,int target){
	        for(Node n=head;n!=null;n=n.next){
	            if(n.data==target)return true;
	        }
	        return false;
	    }
	    public void reverse(Node head){
	        int[] array=new int[size(head)];
	        int count=0;
	        for(Node n=head;n!=null;n=n.next){
	            array[count]=n.data;
	            count++;
	        }
	        Node temp=head;
	        for(int i=array.length-1;i>=0;i--){
	            temp.data=array[i];
	            temp=temp.next;
	        }
	    }
	    public int highest(Node head){
	        int highest=head.data;
	        for(Node n=head.next;n!=null;n=n.next){
	            if(highest<n.data)highest=n.data;
	        }
	        return highest;
	    }
	    public int lowest(Node head){
	        int lowest=head.data;
	        for(Node n=head.next;n!=null;n=n.next){
	            if(lowest>n.data)lowest=n.data;
	        }
	        return lowest;
	    }
	    public int mid(Node head){
	        if(head==null)throw new IllegalArgumentException("LinkedList does not exist");
	        int mid=(1+size(head))/2;
	        Node temp=head;
	        for(int i=mid;i>1;i--){
	            temp=temp.next;
	        }
	        return temp.data;
	    }
	    public int frequency(Node head,int value){
	        int count=0;
	        for(Node n=head;n!=null;n=n.next){
	            if(n.data==value)count++;
	        }
	        return count;
	    }
	    public Node concatenate(Node p,Node q){
	        if(p==null)return q;
	        if(q==null)return p;
	        Node temp=p;
	        while (temp.next!=null){
	            temp=temp.next;
	        }
	        temp.next=q;
	        return p;
	    }
	    public Node copy(Node head){
	        Node start=new Node(head.data);
	        Node q=start;
	        for(Node n=head.next;n!=null;n=n.next){
	            q.next=new Node(n.data);
	            q=q.next;
	        }
	        return start;
	    }
	  
  }

public class Linkedlist {

	public static void main(String[] args) {
		
		
		Node node=new Node(2);
		
		
		node.next=new Node(3);
		
		node.next.next=new Node(4);
		
		node.next.next.next=new Node(12);
		
		
		node.next.next.next.next=new Node(21);
		
		
	    System.out.println("List of elements in linked list");
	    
		for(Node node2=node;node2!=null;node2=node2.next)
		{
			
			
			System.out.print(node2.data+" ");
		}
	    
	   
		
		
		list list=new list();
		System.out.println();
		
		
		System.out.println("Searching  :"+list.search(node, 2));
		
		
		
		System.out.println("Finding mid:"+list.mid(node));
		
		
	//	System.out.println("Insertion:"+list.insertAtSpecificPosition(node, 32, 2));
		
		System.out.println("Is sorted:"+list.isSorted(node));
		
		System.out.println("Is ascending :"+list.isAscending(node));
		
		System.out.println("Is descending:"+list.isDescending(node));
		
		System.out.println("Hihest element:"+list.highest(node));
		
		System.out.println("Lowest element:"+list.lowest(node));
		
		
		
	} }

     
