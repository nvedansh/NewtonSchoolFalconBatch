// Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
       list.add(x);
    }
    
    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        Collections.sort(list); //[1,2,3]
    }
    
    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {   
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == val){
                System.out.print(i +" ");
                return;
            }
        }
        System.out.print("-1 ");
    }
    
    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {   
        //decreasing order
        Collections.sort(list, Collections.reverseOrder());
    }