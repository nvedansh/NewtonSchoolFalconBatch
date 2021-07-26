/*

  class Queue{ 
    static final int MAX = 10000; 
    int rear=0,front=0; 
    int a[] = new int[MAX]; 
}
    int rear=0,front=0; //pointer to rear and front
    int a[] //array that contain elements of queue
*/ 
public static void enqueue(int x, int size)
{
    if(rear >= size){
        System.out.println("Queue is full");
        return;
    }
    a[rear] = x;
    rear++;
}
//front = 3, rear = 3 //3 elements in the queue
public static void dequeue()
{
    if(front >= rear){
        System.out.println("Queue is empty");
        return;
    }
    front++; 
}
public static void displayfront()
{
    if(front >= rear){
        System.out.println("Queue is empty");
        return;
    }
    System.out.println(a[front]);
}

}