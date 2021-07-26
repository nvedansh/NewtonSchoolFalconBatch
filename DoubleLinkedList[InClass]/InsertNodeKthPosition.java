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

/**
1. beginning
2. middle
3. end

**/
public static Node insertnew(Node head,int K, int pos) {        
    Node newnode = new Node(K);
    if(pos == 1){
        //beginning
        newnode.next = head;
        head.prev = newnode;
        return newnode;
    }
    //k = 0, pos = 3, LL = 1->(temp, 2)->(temp2, 3)->4->5;
    int cnt = 1;
    Node temp = head; //temp = 2
    while(cnt < pos - 1){
        temp = temp.next;
        cnt++;
    }
    //temp is pointing to 1 before position
    if(temp.next == null){
        //end
        newnode.prev = temp;
        temp.next = newnode;
    }
    else{
        Node temp2 = temp.next;
        
        newnode.next = temp2;
        temp2.prev = newnode;
        
        temp.next = newnode;
        newnode.prev = temp;
    }
    return head;
}