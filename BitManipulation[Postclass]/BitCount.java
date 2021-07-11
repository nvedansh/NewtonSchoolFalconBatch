import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long cnt=0;
		while(n>0)
		{
			long p=n%2l;
			cnt+=p;
			n/=2l;
		}
		System.out.println(cnt);
	}
}