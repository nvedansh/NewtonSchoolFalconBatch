static void circularRotate(Deque<Integer> deq, int d, int n)
    {
        // Push first d elements 
        // from last to the beginning 
        for (int i = 0; i < d%n; i++) { 
            int val = deq.peekLast(); 
            deq.removeLast(); 
            deq.addFirst(val); 
        } 
    }