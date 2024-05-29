package task4;

import java.util.Stack;

public class SortingStack {
	public static Stack<Integer> SortStack(Stack<Integer> s){
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!s.isEmpty())
		{
			int current = s.pop();
			while(!tempStack.isEmpty() && tempStack.peek()>current) {
				s.push(tempStack.pop());
			}
			tempStack.push(current);
		}
		while(!tempStack.isEmpty()) {
			s.push(tempStack.pop());
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(3);
		s.push(1);
		s.push(4);
		s.push(2);
		s.push(5);
		s.push(8);
		System.out.println(SortStack(s));

	}

}
