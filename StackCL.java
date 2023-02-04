package com.split;

import java.util.Stack;

public class StackCL {
    private Stack<Double> stack = new Stack<Double>();

    public StackCL() {
    }

    public void push(double number) {
        stack.push(number);
    }

    public double pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Cannot pop an empty stack.");
        }
        return stack.pop();
    }

    public double peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Cannot peek at an empty stack.");
        }
        return stack.peek();
    }

    public void performOperation(String operation) {
        double a, b;
        switch (operation) {
            case "+":
                a = pop();
                b = pop();
                push(b + a);
                break;
            case "-":
                a = pop();
                b = pop();
                push(b - a);
                break;
            case "*":
                a = pop();
                b = pop();
                push(b * a);
                break;
            case "/":
                a = pop();
                b = pop();
                push(b / a);
                break;
            default:
                throw new IllegalArgumentException("Unknown operation " + operation);
        }
    }
    
    public static void main(String[] args) {
		
    	   StackCL stackCL=new StackCL();
    	   
    	   stackCL.push(12);
    	   stackCL.push(123);
    	   
    	   stackCL.performOperation("-");
    	   
    	   
    	   
    	   System.out.println("Subtraction:"+stackCL.pop());
    	   
    	   stackCL.push(124);
    	   stackCL.push(1243);
    	   
    	   stackCL.performOperation("*");
    	   
    	   
    	   
    	   System.out.println("Multiplication:"+stackCL.pop());
    	   
    	   stackCL.push(1200);
    	   stackCL.push(120);
    	   
    	   stackCL.performOperation("/");
    	   
    	   
    	   
    	   System.out.println("Division:"+stackCL.pop());
    	   
    	   stackCL.push(122);
    	   stackCL.push(123);
    	   
    	   stackCL.performOperation("+");
    	   
    	   
    	   
    	   System.out.println("Addition:"+stackCL.pop());
    	   
	}
}
