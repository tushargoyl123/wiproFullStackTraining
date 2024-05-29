package com.Stack;

public class StackUsingArrays {
	char s[] = new char[10];
	int tos;
	StackUsingArrays() {
		tos = -1;
	}
	void push(char ch) {
		if(tos==9) {
			throw new RuntimeException("Stack overflow");
		}
		else {
			s[++tos] = ch;
		}
	}
	char pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack underflow");
		}
		else {
			return s[tos--];
		}
	}
	char peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack Underflow");
		}
		else {
			return s[tos];
		}
	}
	boolean isEmpty() {
		if(tos==-1) return true;
		else return false;
	}
}
