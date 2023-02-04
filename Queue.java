package gui.com;

public class Queue {
           int queue[] =new int[5];
           int size;
           int rear;
           int front;
           
           public void enqueue(int data)
           {
        	   queue[rear]=data;
        	   
        	   if(!IsFull())
        	   {
        		   rear=rear+1;
            	   size=size+1; 
        	   }
        	   
        	   else {
				System.out.println("Queue is full");
			}
        	 
        	   
           }
           
           public void showqueue()
           {
        	   System.out.print("Elements:");
        	   
        	   for(int i=0;i<size;i++)
        	   {
        		   System.out.print(queue[front+i]+" ");
        	   }
           }
           
           public int dequeue()
           {
        	   int data=queue[front];
        	   
        	  if(!IsEmpty())
        	  {
        		 
           	   front=front+1;
           	   size=size-1;
        	  }
        	  
        	  else {
				System.out.println("Queue is empty");
			}
        	   
        	   
        	   return data;
           }
           
           public int getsize()
           {
        	   return size;
           }
           
           public boolean IsEmpty()
           {
        	   return size==0;
           }
           
           public boolean IsFull()
           {
        	   return size==5;
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q=new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println("Size :"+q.getsize());
		System.out.println("Is full:"+q.IsFull());
		q.showqueue();
		
		q.dequeue();
		q.dequeue();
		System.out.println();
		System.out.println("After deleting");
		System.out.println();
		System.out.println("Size:"+q.getsize());
		
		System.out.println("Is empty ?"+q.IsEmpty());
		q.showqueue();
		

	}

}
