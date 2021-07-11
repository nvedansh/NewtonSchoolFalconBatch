import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

/*
Sorting - To put it simply, Arranging the collection of elements in ascending/descending order
		- Or in any particular order, but mostly we are interested in ascending/descending order.

There are different ways to sort an array?
One of them selection sort(simple) sorting algorithm. 

4 1 2 5 7 6
1 2 4 5 6 7
1 2 4 5 6 7
Select the largest and place it in the last position
Select the second-largest and place it in the second last position
....
This will sort the whole array

This is the whole idea of selection sort
*/


class Main {

	/*
		int a = 5, b = 10
		After swap/interchange => b = 5, a = 10

		int temp = b; //temp = 10
		b = a; //b = 5
		a = temp; // a = 10
	*/



	public static void selectionSort(int a[], int n){
		/*
			1 2 4 5 6 7
			i = 5// Find the element for 5th position
			max_index = 4

			i = 4// Find the element for 4th position
			max_index = 4

			i = 3
			max_index = 3

			i = 2
			max_index = 0

			i = 1
			max_index = 0

			i = 0
		*/

		for(int i = n - 1; i > 0; i--){
			int max_index = i;
			for(int j = 0; j < i; j++){
				if(a[j] > a[max_index]){
					max_index = j;
				}
			}
			//After finding max_index, swap it with the correct position
			if(max_index != i){
				int temp = a[i];
				a[i] = a[max_index];
				a[max_index] = temp;
			}
		}
	}


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases-- > 0){
			/* Input Section */
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
			}
			selectionSort(a, n);
			/* Output Section */
			for(int i = 0; i < n; i++){
				System.out.print(a[i]+ " ");
			}
			System.out.println(); //New line for every test case
		}
		
	}
}