private static void printRightView(Node root)  
    { 
        if (root == null) 
            return; 
              
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root); 
          
        while (!queue.isEmpty())  
        {    
            // number of nodes at current level 
            int n = queue.size(); 
              
            // Traverse all nodes of current level  
            for (int i = 1; i <= n; i++) { 
                Node temp = queue.poll(); 
                  
                // Print the right most element at  
                // the level 
                if (i == n) 
                    System.out.print(temp.data + " "); 
                  
                // Add left node to queue 
                if (temp.left != null) 
                    queue.add(temp.left); 
                      
                // Add right node to queue 
                if (temp.right != null) 
                    queue.add(temp.right); 
            } 
        } 
    }