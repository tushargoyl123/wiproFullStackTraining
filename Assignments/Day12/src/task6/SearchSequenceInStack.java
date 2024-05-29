package task6;

import java.util.Stack;

public class SearchSequenceInStack {
	public static boolean SearchSequence(Stack<Integer> stack, int seq[]) {
		Stack<Integer> temp = new Stack<Integer>();
		while(!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		int start = 0;
		int end = seq.length;
		while(!temp.isEmpty()) {
			int current = temp.pop();
			if(current==seq[start])
			{
				start++;
				if(start==end) return true;
			}
			else {
				start = 0;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.add(6);
		stack.add(7);
		int seq[] = {4,5,6};
		System.out.println(SearchSequence(stack, seq));

	}

}
