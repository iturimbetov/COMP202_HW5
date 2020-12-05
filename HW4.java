import java.util.Scanner;

public class HW4 {
	
	// median exercise #1
	public static double perfectMedian(BinarySearchTree bst){
		// your code goes here, you a free to add helper methods
		return 0;	
	}

	// median exercise #2
	public static double anyMedian(BinarySearchTree bst){
		// your code goes here, you a free to add helper methods
		return 0;	
	}
	
	// median exercise #3
	public static double nChildrenMedian(BinarySearchTree bst){
		// your code goes here, you a free to add helper methods
		return 0;	
	}
	
	// median exercise #4
	public static double twoTreesMedian(BinarySearchTree tree1, BinarySearchTree tree2){
		// your code goes here, you a free to add helper methods
		return 0;	
	}

	public static void main(String[] args) {
		// this method is for your own testing purposes
		BinarySearchTree myTree = new BinarySearchTree();

		Scanner scan = new Scanner(System.in);
			
		// reads integer tokens from the console and constructs a BinarySearchTree from them
		while (scan.hasNextInt()) {
			int value = scan.nextInt();
			myTree.add(value);
		}
		
		scan.close();
		anyMedian(myTree);
	}

}
