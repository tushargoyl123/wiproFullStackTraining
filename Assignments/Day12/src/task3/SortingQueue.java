package task3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SortingQueue {
	
	public static void sortQueue(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while(!(queue.isEmpty())) {
			int current = queue.poll();
			while(!stack.isEmpty() && stack.peek()>current) {
				queue.add(stack.pop());
			}
			stack.push(current);
		}
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(3);
		queue.add(1);
		queue.add(4);
		queue.add(2);
		queue.add(5);
		queue.add(8);
		sortQueue(queue);
		System.out.println(queue);
	}

}
