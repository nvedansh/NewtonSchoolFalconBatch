import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {


	public static long cost(long n){
		if (n == 0){
			return 0;
		}
		long g = (n-1)/3+1;
		return g*g + cost(n-g);
	}

	public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int q = sc.nextInt();
			while(q-- > 0){
				long n = sc.nextLong();
				System.out.println(cost(n));
			}
	}
}