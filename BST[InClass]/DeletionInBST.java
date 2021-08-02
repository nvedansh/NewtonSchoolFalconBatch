/*
// Information about the class
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

public static Node findLeftMost(Node node){
    while(node.left != null){
        node = node.left;
    }
    return node;
}


public static Node deleteInBST(Node root, int value) 
{
        if(root == null){
            return null;
        }
        if(root.data > value){
            root.left = deleteInBST(root.left, value);
        }
        else if(root.data < value){
            root.right = deleteInBST(root.right, value);
        }
        else{
            // root.data == value
            /*
                1. if root has 2 children
                2. if root has 1 child
                3. if root has no child
            */
            if(root.left != null && root.right != null){
                //2 children case
                //find sucessor
                Node successor = findLeftMost(root.right);
                root.data = successor.data;
                root.right = deleteInBST(root.right, successor.data);
            } 
            else if(root.left != null){
                //1 child case --> Left child
                root = root.left;
            }
            else if(root.right != null){
                //1 child case --> Right Child
                root = root.right;
            }
            else{
                //no child
                root = null;
            }
        }
        return root;
}