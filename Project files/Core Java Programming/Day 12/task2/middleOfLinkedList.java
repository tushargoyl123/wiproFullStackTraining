package task2;

import com.linkedlist.LinkedList;

public class middleOfLinkedList{
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		System.out.println(l1.getMiddle());
	}
}
