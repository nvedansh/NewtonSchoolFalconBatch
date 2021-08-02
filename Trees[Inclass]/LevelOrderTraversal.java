/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
static void levelOrder(Node root){
  if(root == null){
    return;
  }

  Queue<Node> queue = new LinkedList<>();
  queue.add(root);//add root
  
  while(queue.size() > 0){
      Node node = queue.remove(); //remove
      System.out.print(node.data+" "); //print
      //Add Children
      if(node.left != null){
        queue.add(node.left);
      }
      if(node.right != null){
        queue.add(node.right);
      }
  }

}