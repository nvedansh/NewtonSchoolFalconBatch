/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

    5 2 6
    
    k = 6
    pos = 4
    1->2->3->4->5

    i = 1;
    prev = head; //prev(1, x)
    while(i < pos - 1){
        temp = temp.next;
    }

*/

public static Node addElement(Node head, int k ,int pos ) {
    
    //1 2 3 4 5 6
    //k = 8, pos = 4

    //Output: 1 2 3 8 4 5 6
    // LL = (1, add(2)) (2, add(3)) (3, add(8)), (8, add(4)), (4,add(5)), (5,add(6)) (6, null)
    //head = address(1) 
    Node newelement = new Node(k); //(8, null)
    if(head == null || pos == 1){
        newelement.next = head;
        return newelement;
    }
    int i = 1; //3
    Node prev = head; //prev = address(3)
    while(i < pos - 1){
        prev = prev.next;
        i++;
    }
    newelement.next = prev.next; //
    prev.next = newelement;
    return head;
}