package task3;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MinHeap {

	private ArrayList<Integer> heap;
	public MinHeap() {
		this.heap = new ArrayList<Integer>();
	}
	private int parent(int index) {
		return (index-1)/2;
	}
	private int leftChild(int index) {
		return 2*index+1;
	}
	private int rightChild(int index) {
		return 2*index+2;
	}
	private void swap(int index1, int index2) {
		int temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}
	public void insert(int element) {
		heap.add(element);
		int index = heap.size()-1;
		while(index>0 && heap.get(parent(index))>heap.get(index)) {
			swap(index,parent(index));
			index = parent(index);
		}
	}
	public int getMin() {
		if(heap.isEmpty()) {
			throw new NoSuchElementException("Heap is empty");
		}
		int min = heap.get(0);
		return min;
	}
	public int deleteMin() {
		if(heap.isEmpty()) {
			throw new NoSuchElementException();
		}
		int min = heap.get(0);
		int lastElement = heap.remove(heap.size()-1);
		if(!(heap.isEmpty())) {
			heap.set(0, lastElement);
			heapify(0);
		}
		return min;
	}
	public void heapify(int index) {
		int left = leftChild(index);
		int right = rightChild(index);
		int smallest = index;
		if(left<heap.size() && heap.get(left)<heap.get(smallest)) {
			smallest = left;
		}
		if(right<heap.size() && heap.get(right)< heap.get(smallest)) {
			smallest = right;
		}
		if(smallest!=index) {
			swap(index,smallest);
			heapify(smallest);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap minheap = new MinHeap();
		minheap.insert(3);
		minheap.insert(2);
		minheap.insert(1);
		System.out.println("min element: "+minheap.getMin());
		System.out.println("deleted min element: "+minheap.deleteMin());
		System.out.println("new min element: "+minheap.getMin());
		minheap.insert(0);
		System.out.println("min element after inserting 0: "+minheap.getMin());

	}

}
