package com.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> {
	class Node {
		T data;
		Node next;
		Node(T val) {
			data = val;
			next = null;
		}
	}

	Node head;

	public LinkedList() {
		head = null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void insertAtBeginning(T val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
	}
	public void insertAfterIdx(int idx, T val) {
		Node node = new Node(val);
		if(idx<0) throw new IndexOutOfBoundsException("Index: "+idx+" is out of bounds");
		if(idx==0) head = node;
		else {
			Node current = head;
			for(int i=0; i<idx; i++) {
				current = current.next;
			}
			node.next = current.next;
			current.next = node;
		}
	}
	
	public void insertAtEnd(T val) {
		Node node = new Node(val);
		if(head==null) {
			head = node;
		}
		else {
			Node current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = node;
		}
	}
	public void insertAfter(T data, T val) {
		Node node = new Node(val);
		if(head==null) {
			head = node;
		}
		else {
			Node current = head;
			while(current.data!=data) {
				current = current.next;
			}
			node.next = current.next;
			current.next = node;
		}
	}
	public void deleteAtBeginning() {
		if(head==null) throw new IndexOutOfBoundsException("index -1 is out of bounds");
		head = head.next;
	}
	public void deleteAtIdx(int idx) {
		if(idx<0) throw new IndexOutOfBoundsException("index "+idx+" is out of bounds");
		if(idx==0) head = null;
		else {
			Node current = head;
			for(int i=0; i<idx-1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
		}
	}
	public void reverse() {
		Node prev = null;
		Node curr = head;
		Node next = head.next;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	public Iterator<T> iterator(){
		return new Iterator<T>() {
			Node temp = head;

			@Override
			public boolean hasNext() {
				return temp!=null;
			}

			@Override
			public T next() {
				if(temp==null) throw new NoSuchElementException();
				T val = temp.data;
				temp = temp.next;
				return val;
			}
			
		};
	}
	
	public T getPos(int idx) {
		if(idx<0) throw new IndexOutOfBoundsException("index "+idx+" is out of bounds");
		else {
			Node curr = head;
			for(int i=0; i<idx; i++) {
				curr = curr.next;
			}
			return curr.data;
		}
	}
	public void updatePosVal(int idx, T val) {
		if(idx<0) throw new IndexOutOfBoundsException("index "+idx+" is out bounds");
		else {
			Node curr = head;
			for(int i=0; i<idx; i++) {
				curr = curr.next;
			}
			curr.data = val;
		}
	}
	public void deleteAtEnd() {
		if(head==null) throw new IndexOutOfBoundsException("Linked list is empty");
		Node curr = head;
		while(curr.next.next!=null) {
			curr = curr.next;
		}
		curr.next = null;
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public int search(T val) {
		if(head==null) return -1;
		Node curr = head;
		int i=0;
		while(curr!=null) {
			T data = curr.data;
			if(data==val) {
				return i;
			}
			curr = curr.next;
			i++;
		}
		return -1;
	}
	public boolean contains(T val) {
		if(head==null) return false;
		Node curr = head;
		while(curr!=null) {
			T data = curr.data;
			if(data==val) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

}
