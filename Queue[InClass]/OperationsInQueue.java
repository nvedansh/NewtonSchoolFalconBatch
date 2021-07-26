// enqueue():- that takes the queue
// and the integer to be added as a parameter.
public static void enqueue(Queue<Integer> qu, int x)
    {
        qu.add(x);
    }

// dequeue():- that takes the queue as parameter.
 public static void dequeue(Queue<Integer> qu)
    {
        if(qu.size() != 0){
            qu.poll();
        }
    }

// displayfront():-  that takes the queue as parameter.
    public static void displayfront(Queue<Integer> qu)
    {
        if(qu.size() != 0){
            System.out.println(qu.peek());
        }
        else{
            System.out.println("0");
        }
    }