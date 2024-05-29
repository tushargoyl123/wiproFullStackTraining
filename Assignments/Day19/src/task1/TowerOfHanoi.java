package task1;
public class TowerOfHanoi {
	
	public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
		if(n==0) {
			return;
		}
		solveHanoi(n-1, fromRod, auxRod, toRod);
		System.out.println("Move disk "+n+" from rod "+fromRod+" to rod "+toRod);
		solveHanoi(n-1, auxRod, toRod, fromRod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		solveHanoi(n, 'A', 'B', 'C');
	}

}
