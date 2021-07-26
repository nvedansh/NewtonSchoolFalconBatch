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
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

    O(n)

    Excercise: Write another function to insert the node in the end
    in constant amount of time;


*/

static Node h3, e3;

//1, 2, 3, 4, 5
//h3 = null, e3 = null
//h3 -> [(1, address(2)) -> e3 -> (2, null)]
public static Node insertEnd(int val){
    if(h3 == null){
        h3 = new Node(val);
        e3 = h3;
    }
    else{
        Node newnode = new Node(val); //(2, null)
        e3.next = newnode;
        e3 = e3.next;
    }
    return h3;
}


public static Node Merge (Node h1, Node h2){
    h3 = null;
    e3 = null;
    while(h1!=null && h2!=null){
        if(h1.val <= h2.val){
            h3 = insertEnd(h1.val);
            h1 = h1.next;
        }
        else{
            h3 = insertEnd(h2.val);
            h2 = h2.next;
        }
    }
    while(h1 != null){
        h3 = insertEnd(h1.val);
        h1 = h1.next;
    }
    while(h2 != null){
        h3 = insertEnd(h2.val);
        h2 = h2.next;
    }
    return h3;
}