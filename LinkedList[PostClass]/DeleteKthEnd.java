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

public static Node deleteElement(Node head, int k) {
    
    Node start = head;
    Node end = head;
    while(k-- > 0){
        end = end.next;
    }
    if(end == null){
        start = start.next;
        return start;
    }

    while(end.next != null){
        start = start.next;
        end = end.next;
    }

    //create link between s.next and s.next.next
    if(start.next.next == null){
        //deleting element;
        start.next = null;
        return head;
    }

    start.next = start.next.next;

    return head;

}