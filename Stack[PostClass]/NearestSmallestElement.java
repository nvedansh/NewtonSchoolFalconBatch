import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();

        int arr[] = new int[arrSize];
        for(int i = 0; i < arrSize; i++)
           arr[i] = sc.nextInt();
           
        nearSmaller(arr, arrSize);
	}
    static void nearSmaller(int arr[], int arrSize)
    {
            Stack<Integer> s = new Stack<>();
        for(int i = 0; i < arrSize; i++)
        {
            while(!s.empty() == true && arr[s.peek()] > arr[i])
                s.pop();
            if(s.empty() == true)
               System.out.print(-1 +" ");
            else
                System.out.print(arr[s.peek()]+" ");
            s.push(i);
        }	
    }

}