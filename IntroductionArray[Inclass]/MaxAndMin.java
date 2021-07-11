import java.io.*;
import java.util.*;
class Main
  {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++)
            	arr[i] = sc.nextInt();

            findMinMax(arr, n);
            System.out.println();
        }
    }
    public static void findMinMax(int arr[], int n)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++)
        {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        
        System.out.print(max + " " + min);
    }
}