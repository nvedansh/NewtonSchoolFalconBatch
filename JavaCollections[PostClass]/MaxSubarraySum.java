import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int ans = 0;
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n+1];
		for(int i = 1; i <= n; i++)
			a[i] = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= k; i++)
			sum += a[i];
		
		ans = sum;
		for(int i = k+1; i <= n; i++){
			sum += a[i] - a[i-k];
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
	}
}