import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int k = sc.nextInt();
			long[] arr = new long[n];
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextLong();
			}
			Arrays.sort(arr);
			long ans = 1;
			for(int i = n - k; i < n; i++){
				ans *= arr[i];
			}
			System.out.println(ans);
		}
	}
}