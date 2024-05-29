package task5;

class Node {
	int data;
	Node next;

	public Node(int val) {
		data = val;
		next = null;
	}
}

public class removeDupFromLL {
	Node head;

	public void removeDuplicates() {
		Node current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void add(int val) {
		Node node = new Node(val);
		if(head==null) head = node;
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDupFromLL l1 = new removeDupFromLL();
		l1.add(1);
		l1.add(2);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l1.add(3);
		l1.add(4);
		l1.removeDuplicates();
		l1.printList();

	}

}
