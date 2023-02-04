package com.split;
import java.util.HashMap;
import java.util.Map;
public class Number {
	

	
	  public static void main(String[] args) {
	    int[] array = {1, 2, 3, 1, 2, 3, 4};

	    // Create a map to store the count of each element
	    Map<Integer, Integer> elementCount = new HashMap<>();
	    for (int element : array) {
	      int count = elementCount.getOrDefault(element, 0);
	      elementCount.put(element, count + 1);
	    }

	    // Count the number of elements that occur only once
	    int count = 0;
	
	    for (int element : array) {
	      if (elementCount.get(element) == 1) {
	        count++;
	      }
	    }

	    System.out.println("Number of elements that occur only once:"+count);
	  }
	

}
