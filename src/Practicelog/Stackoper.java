package Practicelog;

import java.util.*;
import java.util.Collections;

public class Stackoper {
	public static void main(String[] args) {
		Stack<Integer>c=new Stack<>();
		c.push(30);
		c.push(20);
		c.push(10);
		c.push(40);
		sortstack(c);
	}
	static void sortstack(Stack<Integer> stack) {
		Collections.sort(stack);
		System.out.println(stack);
	}

}
