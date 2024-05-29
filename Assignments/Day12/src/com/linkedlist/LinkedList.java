package com.linkedlist;

public class LinkedList<T> {
	class Node{
		T data;
		Node next;
		Node(T val){
			data = val;
			next = null;
		}
	}
	Node head;
	public LinkedList(){
		head = null;
	}
	public Node add(T val)
	{
		Node node = new Node(val);
		if(head==null) head = node;
		else {
			Node current = head;
			while(current.next!=null)
			{
				current = current.next;
			}
			current.next = node;
			
		}
		return head;
	}
	public T getMiddle() {
		if(head==null) return null;
		else {
			Node slow = head;
			Node fast = head;
			while(fast.next!=null && fast.next.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow.data;
		}
	}
}
