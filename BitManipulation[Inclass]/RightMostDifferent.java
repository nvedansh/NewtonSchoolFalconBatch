import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {


	public static int solve(int m, int n){ //11, 9
			int output = m ^ n; // 1011 ^ 1001 = 0010
			int i = 32;
			count = 1
			while(i-- > 0){
				if((output & 1) == 1){ //0001 & 0001 = 0001
					return 32 - i;
				}
				output >>= 1; //0010 => 0001
			}
			return -1;
	}
	

	public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-- > 0){
				int m = sc.nextInt();
				int n = sc.nextInt();
				System.out.println(solve(m, n));
			}
			
	}
}