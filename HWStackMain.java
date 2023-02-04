package com.split;

public class HWStackMain {

	public static void main(String[] args) {
		
		
		HW_Stack stack=new HW_Stack(5);
		
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		stack.push(17);
		stack.push(18);
		
		HW_Stack stack1=new HW_Stack(5);
		
		stack1.push(22);
		stack1.push(23);
		stack1.push(34);
		stack1.push(45);
		stack1.push(56);
		stack1.push(67);
		stack1.push(78);
		
		
		
		System.out.println(stack.equals(stack1));
		
		System.out.println(stack.toString());
		
		System.out.println("Popping last element from stack 1:"+stack.popLastElement());
		
		System.out.println("Popping last element from stack 1:"+stack.popLastElement());
		
		System.out.println("Popping last element from stack 2:"+stack1.popLastElement());
		
		System.out.println("Popping last element from stack 2:"+stack1.popLastElement());
		System.out.println(stack);
		
	}

}
