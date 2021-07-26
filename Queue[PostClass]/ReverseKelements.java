static Queue<Integer> ReverseK(Queue<Integer> queue, int k) { 
        
       
  
        Stack<Integer> stack = new Stack<Integer>(); 
  
        // Push the first K elements into a Stack  
        for (int i = 0; i < k; i++) { 
            stack.push(queue.peek()); 
            queue.remove(); 
        } 
  
          
        // Enqueue the contents of stack at the back  
        // of the queue 
        while (!stack.empty()) { 
            queue.add(stack.peek()); 
            stack.pop(); 
        } 
  
          
        // Remove the remaining elements and enqueue  
        // them at the end of the Queue 
        for (int i = 0; i < queue.size() - k; i++) { 
            queue.add(queue.peek()); 
            queue.remove(); 
        } 
        return queue;
    }