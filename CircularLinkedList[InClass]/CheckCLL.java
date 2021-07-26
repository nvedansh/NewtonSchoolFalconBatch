/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static int check(Node head) {
    /*
        a. 1->2->3->4->null
        b. 1->2->3->1
    */

    Node temp = head.next;
    while(temp != null && temp != head){
        temp = temp.next;
    }
    if(temp == null)
        return 0;
    return 1;
}