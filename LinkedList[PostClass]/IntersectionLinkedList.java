
public static Node intersection(Node head1,Node head2){  int aLength = getLength(head1), bLength = getLength(head2);
        Node currA = head1, currB = head2;
        if (bLength > aLength) 
            for (int i = 0; i < bLength - aLength; i++) currB = currB.next;
        
        if (aLength > bLength) 
            for (int i = 0; i < aLength - bLength; i++) currA = currA.next;
        
        while (currA != null  && currB != null) {
            if (currA == currB) return currA;
            currA = currA.next;
            currB = currB.next;
        }
        
        return null;
    }
    
    private static int getLength(Node head) {
        Node curr = head;
        int len = 0;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        return len;
    }
