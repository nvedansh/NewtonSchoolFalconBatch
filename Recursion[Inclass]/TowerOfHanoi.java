import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	
	public static void toh(int n, String source, String temp, String destination){
		if(n == 0){
			return;
		}
		toh(n - 1, source, destination ,temp);
		System.out.println(n+":"+source+"->"+destination);
		toh(n - 1, temp, source , destination);
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		toh(n, "A", "B", "C");
	}
}