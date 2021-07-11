import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	//10203: No

	/*
		100101
		1 digit number consecutive sequence: 1, 0, 0, 1, 0, 1: No
		2 digit number consecutive sequence: 10, 01, 01: No
		3 digit number consecutive sequence: 100, 101: Yes 100

		1000101: 7
		1 digit number consecutive sequence: 1, 0, 0, 0, 1, 0, 1: No
		2 digit number consecutive sequence: 10, 00, 10, 1: No
		3 digit number consecutive sequence: 100, 010, 1: No
		4 digit number consecutive sequence: 1000, 101: We dont have to check
	*/
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int length = str.length();
		long ans = -1;

		for(int digit = 1; digit*2 <= length; digit++){
			long x = 0;
			//str = 135136, digit = 3
			for(int i = 0; i < digit; i++){
				x = (10 * x) + (str.charAt(i) - '0'); //x = 1, 13, 135
				//'1' - '0' => 49 - 48 = 1
				//'3' - '0' => 51 - 48 = 3
				//'5' - '0' => 53 - 48 = 5
			}
			String consecutiveSequnce = "";
			long y = x;
			while(consecutiveSequnce.length() < str.length()){
				consecutiveSequnce += String.valueOf(x); //consecutiveSequnce = "135136"
				x++; //136
			}
			if(consecutiveSequnce.equals(str)){
				ans = y;
				break;
			}
		}
		if(ans == -1){
			System.out.println("NO");
		}
		else{
			System.out.println("YES "+ans);
		}

	}
}