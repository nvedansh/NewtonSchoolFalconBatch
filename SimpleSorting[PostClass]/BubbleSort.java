import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

//java//util//Lots of java files

// don't change the name of this class
// you can add inner classes if needed
class Main {
	/*
		If n is the size of the array we need n - 1 iterations
		
		
		[1st Iteration] => 4 1 3 9 7 
		    			=> 1 4 3 9 7 (1 swap)
						=> 1 3 4 9 7 (1 swap)
						=> 1 3 4 9 7 (0 swap)
						=> 1 3 4 7 9 (1 swap)
		[2nd Iteration] => 1 3 4 7 9(1,3)
						=> 1 3 4 7 9(3,4)
						=> 1 3 4 7 9(4,7)
						

		Every Iteration I will make one less comparison.
		Becaus second iteration there is not swap I do not have to make a third
		Iterations
		[1st Iteration] => 4 3 2 1
						=> 3 4 2 1(1 swap)
						=> 3 2 4 1(1 swap)
						=> 3 2 1 4(1 swap)
		
		[2nd Iteration] => 3 2 1 4
						=> 2 3 1 4(1 swap)
						=> 2 1 3 4(1 swap)
		
		[3rd Iteration] => 2 1 3 4
						=> 1 2 3 4(1 swap)

		In selection sort in worst case also you will have n swaps
		
		Use Bubble sort for time
		Use Selection sort for less number of write operations
		
	*/

	public static void bubbleSort(int a[], int n){
		int swap = 0;

		for(int i = 0; i < n-1; i++){
			/*
				After 1st iteration n-1th element is in right place
				after every iteration n-1-i is in the right place
			*/
			swap = 0;
			//2 1 3 4 
			for(int j = 0; j < n-1-i ; j++){ //j < n-2
				if(a[j] < a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swap++;
				}
			}
			if(swap == 0){
				break;
			}
		}
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = 1;
		while(testcases-- > 0){
			/* Input Section */
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
			}
			bubbleSort(a, n);
			/* Output Section */
			for(int i = 0; i < n; i++){
				System.out.print(a[i]+ " ");
			}
			System.out.println(); //New line for every test case
		}
		
	}
}