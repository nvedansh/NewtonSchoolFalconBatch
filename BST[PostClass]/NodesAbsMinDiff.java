/*
// Information about the class Node
class Node{
    int data;
    Node left;
    Node right;
  
    Node(int data){
        this.data = data;
        left=null;
        right=null;
       
    }
}
*/
 static Integer prev = null, minDiff = Integer.MAX_VALUE;
    public static  int absMinDist(Node root) {
        prev = null;
        minDiff = Integer.MAX_VALUE;
        bst(root);
        return minDiff;
    }

    public static void bst(Node root) {
        if(root==null) return;
        bst(root.left);
        if(prev!=null) {
            minDiff = Math.min(root.data-prev, minDiff);
        }
        prev= root.data;
        bst(root.right);
    }