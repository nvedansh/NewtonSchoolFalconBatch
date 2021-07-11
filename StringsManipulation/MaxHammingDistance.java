import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		char[] strCharArray = str.toCharArray();

		int[] count = new int[26];
		int maxValue = 0;
		for(int i = 0; i < n; i++){
			count[str.charAt(i) - 'a']++;
			if(maxValue < count[str.charAt(i) - 'a']){
				maxValue = count[str.charAt(i) - 'a'];
			}
		}
		//maxValue is max number of times a character will come
		//aaaaabbbb, maxValue = 5
		//bbbba
		//i = 0, maxValue = 5
		Arrays.sort(strCharArray);
		char[] rCharArray = new char[n];
		for(int i = 0; i < n; i++){
			rCharArray[i] = strCharArray[(i + maxValue) % n];
		}
		int ans = 0;
		for(int i = 0; i < n; i++){
			if(strCharArray[i] != rCharArray[i]){
				ans++;
			}
		}
		System.out.println(ans);
	}
}