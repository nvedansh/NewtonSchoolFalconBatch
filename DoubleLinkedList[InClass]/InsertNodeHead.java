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


public static Node insertnew(Node head,int k) {        
    Node newnode = new Node(k); //(null, k, null)
    if(head == null){ //linked list was empty
        return newnode; //(null, k, null)
    }
    //head = //(address(newnode), head.val, adress(head.next)).............
    newnode.next = head;//(null, k, add(head))
    head.prev = newnode;//
    return newnode;
}