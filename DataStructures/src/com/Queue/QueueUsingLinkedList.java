package com.Queue;

public class QueueUsingLinkedList {
	class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null;
		}
	}
	Node front, rear;
	public QueueUsingLinkedList() {
		front = null;
		rear = null;
	}
	public void enqueue(int val) {
		Node node = new Node(val);
		if(rear==null) {
			front = rear = node;
			return;
		}
		rear.next = node;
		rear = node;
		System.out.println(front.data+" "+rear.data);
	}
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		int data = front.data;
		front = front.next;
		if(front==null) rear = null;
		return data;
				
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		int data = front.data;
		return data;
	}
	public void display() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		Node temp = front;
		while(temp!=null) {
			System.out.print(temp.data+" ->");
			temp = temp.next;
		}
	}
	public boolean isEmpty() {
		return front==null;
	}
}
