package com.split;

import java.util.EmptyStackException;

interface stack{
	  public void push(Object obj);
	  
	  
	  public Object peek();
	  
	  
	  public Object pop();
	  
	  public int size();
  }

public class HW_Stack implements stack {
	private Object[] a;
	private int size=0;
	public HW_Stack(int capacity) {
		a=new Object[capacity];
	}
	//StackOverFlow
	private void resize() {
		Object[] aa=a;
		a=new Object[size*2];
		System.arraycopy(aa, 0, a, 0, size);
	}
	//Stack Underflow
	public boolean isEmpty() {
		return size==0;
	}
	@Override
	public void push(Object obj) {
		if(size==a.length)
			resize();
		a[size++]=obj;
		
	}
	@Override
	public Object peek() {
		if(isEmpty())throw new EmptyStackException();
		return  a[size-1];
	}
	@Override
	public Object pop() {
		if(isEmpty())throw new EmptyStackException();
		Object object=a[--size];
		a[size]=null;
		
		return object;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public boolean equals(HW_Stack stack){
        if(this.size()==stack.size()){
            for(int i=0;i<stack.size;i++)if(!this.a[i].equals(stack.a[i]))return false;
            return true;
        }
            return false;
    }

    public String toString(){
        StringBuilder str= new StringBuilder(a[0].toString());

        for(int i=1;i<size;i++) {
            str.append(", ").append(a[i].toString());
        }
        return "["+str+"]";
    }


    public Object popLastElement() {
        Object obj=a[0];
        System.arraycopy(a,1,a,0,--size);
        return obj;
    }
	
}
