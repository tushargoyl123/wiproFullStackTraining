package task1;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class CheckingBalBinaryTree {


	class TreeInfo {
		int height;
		boolean isBalanced;

		TreeInfo(int height, boolean isBalanced) {
			this.height = height;
			this.isBalanced = isBalanced;
		}
	}

	public boolean isBalanced(TreeNode root) {
		return checkBalance(root).isBalanced;
	}

	private TreeInfo checkBalance(TreeNode node) {
		if(node==null) return new TreeInfo(-1,true);
		TreeInfo left = checkBalance(node.left);
		if(!left.isBalanced) {
			return new TreeInfo(-1,false);
		}
		TreeInfo right = checkBalance(node.right);
		if(!right.isBalanced) {
			return new TreeInfo(-1, false);
		}
		int height = Math.max(left.height, right.height)+1;
		boolean isBalanced = Math.abs(left.height-right.height)<=1;
		return new TreeInfo(height,isBalanced);
		
	}
	
	public static void main(String[] args) {
		CheckingBalBinaryTree tree = new CheckingBalBinaryTree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(3);
		root.left.left.left = new TreeNode(4);
		root.left.left.right = new TreeNode(4);
		System.out.println(tree.isBalanced(root));
	}

}
