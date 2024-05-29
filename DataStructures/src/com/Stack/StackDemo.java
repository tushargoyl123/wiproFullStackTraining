package com.Stack;


public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArrays s1 = new StackUsingArrays();
		s1.push('a');
		System.out.println(s1.peek());
		s1.push('b');
		System.out.println(s1.peek());
		s1.push('c');
		System.out.println(s1.peek());
		s1.push('d');
		System.out.println(s1.peek());
		s1.push('e');
		System.out.println(s1.peek());
		s1.push('f');
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
//		s1.pop();
//		System.out.println(s1.peek());
//		s1.pop();
//		System.out.println(s1.peek());

	}

}
