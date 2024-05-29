package com.list;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.insertAtEnd(0);
		l1.insertAtEnd(1);
		l1.insertAtEnd(2);
		l1.insertAtEnd(3);
		l1.display();
		System.out.println();
		System.out.println(l1.search(2));

	}

}
