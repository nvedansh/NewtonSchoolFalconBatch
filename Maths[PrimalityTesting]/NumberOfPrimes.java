import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

      public static boolean isPrime(long n){
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
            int n = sc.nextInt();
            int count = 0;
            for(int i = 1; i <= n; i++){  
                  if(isPrime(i)){
                        count++;
                  }
            }
            System.out.println(count);
	}
}