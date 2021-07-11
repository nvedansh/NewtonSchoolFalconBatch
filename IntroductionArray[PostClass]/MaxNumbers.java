import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	static void print3largest(int arr[], int arr_size)
    {
        int i, first, second, third;
 
        /* There should be atleast three elements */
        if (arr_size < 3) {
            System.out.print(" Invalid Input ");
            return;
        }
 
        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is greater than
            first*/
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and
            second then update second  */
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
 
            else if (arr[i] > third)
                third = arr[i];
        }
 
        System.out.println(first + " " + second + " " + third);
    }


	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			print3largest(a, n);
		}
	}
}