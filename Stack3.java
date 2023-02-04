package com.split;

import java.util.LinkedList;

public class Stack3<T> {
	   private LinkedList<T> list = new LinkedList<T>();

	    public void push(T element) {
	        list.addFirst(element);
	    }

	    public T pop() {
	        if (list.isEmpty()) {
	            throw new IllegalStateException("Cannot pop an empty stack.");
	        }
	        return list.removeFirst();
	    }

	    public T peek() {
	        if (list.isEmpty()) {
	            throw new IllegalStateException("Cannot peek at an empty stack.");
	        }
	        return list.getFirst();
	    }

	    public boolean isEmpty() {
	        return list.isEmpty();
	    }

	    public int size() {
	        return list.size();
	    }
	    
	    
	    public static void main(String[] args) {
			
	    	Stack3<Integer> t2=new Stack3<>();
	    	
	    	t2.push(12);
	    	t2.push(123);
	    	
	    	System.out.println(t2.peek());
	    	System.out.println(t2.pop());
		}
}
