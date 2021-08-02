/*
class Node
{
    int data;
    Node left, right;
    Node(int data)
   {
      this.data = data;
      this.left = this.right = null;
   }
}
*/

/*
         1
   10          12
14    18
*/

//1 h_left = 2

static int getHeight(Node node) 
{
   if(node == null){
      return 0;
   }
   int h_left = getHeight(node.left); 
   int h_right = getHeight(node.right);
   return Math.max(h_left, h_right) + 1;
}