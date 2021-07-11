import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static long mod = (long) (1e9 + 7);
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long ans = 1l, c = 0l;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'a'){
				c++;
			}
			if(s.charAt(i) == 'b'){
				ans = (ans*(c+1)) % mod;
				c = 0;
			}
		}
		ans = (ans*(c+1)) % mod;
		System.out.println((ans - 1) % mod);
	}
}