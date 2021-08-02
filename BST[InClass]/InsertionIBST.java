/*
// Information about the Node class
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}


            | 1 | -> | 6 |


*/
static Node insertInBST(Node root,int key)
{
    if(root == null){
        return new Node(key);
    }
    if(key > root.data){
       root.right = insertInBST(root.right, key);
    }
    else if(key < root.data){
       root.left = insertInBST(root.left, key);
    }
    return root;
}