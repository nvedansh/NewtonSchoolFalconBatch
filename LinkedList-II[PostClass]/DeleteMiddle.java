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

public static Node deleteMiddleElement(Node head) {
    int cnt = 0;
    Node temp = head;
    while (temp != null) {
        cnt++;
        temp = temp.next;
    }
    if (cnt == 1) {
        head.val = -1;
        return head;
    }
    if (cnt == 2) {
        head.next = null;
        return head;
    }
    temp = head;
    int I = 1;
    cnt = cnt / 2;
    while (I != cnt) {
        temp = temp.next;
        I++;
    }
    temp.next = temp.next.next;
    return head;
}