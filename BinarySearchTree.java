
public class BinarySearchTree implements BSTInterface {
	
	private TreeNode root;
	
	public BinarySearchTree() {
		// add your code here
	}

	@Override
	public void add(int data) {
		// add your code here, you are free to use helper methods
	}

	@Override
	public TreeNode delete(int data) {
		// you don't have to implement this
		return null;
	}

	@Override
	public TreeNode search(int data) {
		// you don't have to implement this
		return null;
	}

	@Override
	public boolean contains(int data) {
		// you don't have to implement this
		return false;
	}
	
	//provides the String representation of the BST in inorder fashion
	public String toString() {
		return toStringInorder(root).trim();
	}
	
	private String toStringInorder(TreeNode root) {
	    String result = "";
	    if (root == null)
	        return result;
	    result += toStringInorder(root.getLeft());
	    result += root.getData() + " ";
	    result += toStringInorder(root.getRight());
	    return result;
	}
	
	public TreeNode getRoot(){
		return root;
	}

}
