package com.split;

import java.util.EmptyStackException;



interface calculator {
	  Object peek();
	  Object pop();
	  void push(Object obj);
	  
	  int size();
  }
  
   class ArrayStack implements calculator {
	  private Object[] a;
	  private int capcaity;
	  
	  public ArrayStack(int size)
	  {
		  a=new Object [size];
	  }
	  
	  
	  public boolean isEmpty()
	  {
		  return capcaity==-1;
	  }
	  
	  public  void resize()
	  {
		  Object[] aa=a;
		  
		  a=new Object[2*aa.length];
		  
		  System.arraycopy(aa, 0, a, 0, capcaity);
	  }
	  
	  public void push(Object obj)
	  {
		  if(capcaity==a.length)
			  resize();
		  
		  a[capcaity++]=obj;
		  
		  
	  }
	  @Override
	  public Object pop()
	  {
		  Object pot=a[--capcaity];
		  
		  a[capcaity]=null;
		  
		  return pot;
	  }
	  
	  public Object peek()
	  {
		  if(isEmpty()) throw new EmptyStackException();
		  
		return  a[capcaity-1];
	  }
	  
	  public int size()
	  {
		  return capcaity;
	  }




	  
  }
  
  
   class  RPN_Calculator
   {
	   public boolean isAnoperator(String operator)
	   {
		   return (operator.length()==1 &&("ASMD".indexOf(operator)>=0 ||"asmd".indexOf(operator)>=0));
	   }
	   
	   public double evaluate(double x, double y, String operator)
	   {
		   double z=0;
		   if(operator.equalsIgnoreCase("A")) z=x+y;
		   else if(operator.equalsIgnoreCase("S")) z=x-y;
		   else if(operator.equalsIgnoreCase("M")) z=x*y;
		   else z=x/y;
		   
		   System.out.println(x+" "+operator+" "+y+"="+z);
		   
		   return z;
	   }
	   
	public   RPN_Calculator(String[] str)
	{
		ArrayStack stack=new ArrayStack(str.length);
		
		
		String s;
		
		for(int i=0;i<str.length;i++)
		{
			s=str[i];
			
			if(isAnoperator(s)) {
			double x=Double.parseDouble((String)stack.pop());
			double y=Double.parseDouble((String)stack.pop());
			
			double z=evaluate(x, y, s);
			
			stack.push(z);
			}
			
			else {
				stack.push(s);
			}
			
		}
		
	}
   }
public class RPN {

	public static void main(String[] args) {
		
		
		String [] str= {"32","43","+","78","90","-","9","12","/"};
		
		new RPN_Calculator(str);
	}

}
