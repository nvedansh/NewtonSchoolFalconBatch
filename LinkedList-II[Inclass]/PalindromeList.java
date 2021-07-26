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

public static Node insertBeginning(Node head, int val){
    if(head == null){
        return new Node(val);
    }
    Node newnode = new Node(val);
    newnode.next = head;
    return newnode;
}

public static boolean IsPalindrome(Node h1) {
    //traverse the linked list, concat in string
    //h1 = 1->2->3->4
    //h2 = 4->3->2->1

    if(h1.next == null){
        //1 node
        return true;
    }
    Node temp1 = h1;
    Node h2 = null;
    while(temp1 != null){
        h2 = insertBeginning(h2, temp1.val);
        temp1 = temp1.next;
    }
    
    temp1 = h1;
    Node temp2 = h2;
    while(temp1 != null && temp2 != null){
        if(temp1.val != temp2.val){
            return false;
        }
        temp1 = temp1.next;
        temp2 = temp2.next;
    }
    return true;

}