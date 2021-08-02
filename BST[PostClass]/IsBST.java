import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}

class Main {

	public static boolean isBST(Node tree, int min, int max){
    	if(tree == null)
			return true;
		if(tree.data < min || tree.data > max)
			return false;
		return isBST(tree.left, min, tree.data - 1) && isBST(tree.right, tree.data + 1, max);
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] tree = new Node[n];
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			tree[i] = new Node(value);
		}
		int root = sc.nextInt();
		 for(int i = 0; i < n; i++){
			int left = sc.nextInt();
			int right = sc.nextInt();
			if(left != 0)
				tree[i].left = tree[left - 1];
			if(right != 0)
				tree[i].right = tree[right - 1];
		}

		if(isBST(tree[root-1], Integer.MIN_VALUE, Integer.MAX_VALUE)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}