import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		if(B.indexOf(A) == -1){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}