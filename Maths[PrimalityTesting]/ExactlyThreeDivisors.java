import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		/*

			First we are going to find if a number is prime or not
			till the max size 100000
			Second we will find how many numbers are prime from 
			1 to n[within a range]
		*/
		int MAX = 100001;
		int a[] = new int[MAX]; //All the values in array is 0
		boolean b[] = new boolean[MAX]; //All values of boolean is false

		//Array indexing 0..100001
		b[0] = true;
		b[1] = true;
		/*
			Prime - false
			Not prime - true
			[0 = true, 1 = true, 2 = false, 3 = false, 4 = true]
			[5 = false, 6 = true, 7= false, 8 = true, 9 = true]
			[10 = true, 11 = false, 12= true, 13 = false, 14 = true]
			[15 = true, 16 = true, 17= false, 18 = true, 19 = false]

			Every number can be stated as multiple of prime numbers
			
		*/
		for(int i = 2; i <  MAX ; i++){
			if(b[i] == false){
				for(int j = 2*i; j < MAX; j += i){
					b[j] = true;
				}
			}
		}

		/*
			b = [0 = true, 1 = true, 2 = false, 3 = false, 4 = true]
			[5 = false, 6 = true, 7= false, 8 = true, 9 = true]
			[10 = true, 11 = false, 12= true, 13 = false, 14 = true]
			[15 = true, 16 = true, 17= false, 18 = true, 19 = false]

			a = [0 = 0, 1 = 0, 2 = 1, 3 = 2, 4 = 2]
			[5 = 3, 6 = 3, 7 = 4, 8 = 4, 9 = 4]
			[10 = 4, 11 = 5, 12 = 5, 13 = 6, 14 = 6]
			[15 = 6, 16 = 6, 17 = 7, 18 = 7, 19 = 8]

		*/
		int count = 0;
		for(int i = 2; i < MAX; i++){
			if(b[i] == false){
				count++;
			}
			a[i] = count;
		}

		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases > 0){
			
			int number = sc.nextInt(); // 30
			int sqrt_number = (int) Math.sqrt(number); // 5
			System.out.println(a[sqrt_number]); // 3
			
			testcases--;
		}


	}
}