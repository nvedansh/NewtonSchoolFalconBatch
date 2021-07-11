import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	//1,3 => 3, 1
	//(nc2) * 2
	

	static long mod = (long) 1e9+7;

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		for(int i = 0; i < n; i++){
			array[i] = sc.nextLong();
		}
		long result = 0;
		for(int i = 0; i < 64; i++){
			long count = 0; //how many ones in that column bit
			long bitshift = (1l << i); //000.....10
			for(int j = 0; j < n; j++){
				if((array[j] & bitshift) == 0){
					count++; //counting number of 0's last bit + second last bit
				}
			}
			result += (count*(n - count)*2);
			result %= mod;
		}
		System.out.println(result);
	}
}