import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long mod = (long) 1e9 + 7;
        long ans=k;
        for(int i=0;i<n-1;i++){
            ans*=k-1;
            ans=ans%mod;
        }
        System.out.println(ans);
	}
}