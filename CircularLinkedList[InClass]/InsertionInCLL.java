/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
  public static Node Reverse(Node head) {
           Node temp = null; 
        Node current = head; 
  
        while (current != null) { 
            temp = current.prev; 
            current.prev = current.next; 
            current.next = temp; 
            current = current.prev; 
        } 
  
        if (temp != null) { 
            head = temp.prev; 
        } 
        return head;
    }