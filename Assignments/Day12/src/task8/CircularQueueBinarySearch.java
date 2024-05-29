package task8;

public class CircularQueueBinarySearch {
	public static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[start]<=arr[mid]) {
				if(target>=arr[start] && target<arr[mid]) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}else {
				if(target>arr[mid] && target<=arr[end]) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] circularQueue = {6,7,0,1,2,3,4,5};
		int target = 3;
		int result = search(circularQueue, target);
		System.out.println(result);

	}

}
