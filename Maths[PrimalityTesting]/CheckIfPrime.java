import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static boolean isPrime(long n){
		//If a number is prime I will return true else false

		/*
			n <= 1 return false 
			n = 2, even prime number

			Which number is not a prime number?
			which has a divisor which is not 1 or not itself
			n = (a * b) 

			n = 12
			1, 2, 3, 4, 6, 12
			(1, 12), (2, 6), (3, 4)

			35
			1, 5, 7, 35
			sqrt(35) = 5
			35 % 2 == 0 ? No
			35 % 3 == 0 ? No
			35 % 4 == 0 ? No 
			35 % 5 == 0 ? Yes

			37
			1, 37
			37 % 2 == 0 ? No
			37 % 3 == 0 ? No
			37 % 4 == 0 ? No 
			37 % 5 == 0 ? No
			37 % 6 == 0 ? No

		*/
		// n = 37
		if(n <= 1){
			return false;
		} 
		long sqrt_n = (long)Math.sqrt(n); //sqrt_n = 6
		for(long i = 2; i <= sqrt_n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}


	public static void main (String[] args) {
            
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases > 0){
			long n = sc.nextLong();
			if(isPrime(n)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			testcases--;
		}
	}
}