import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(str1.length() != str2.length()){
			System.out.println("NO");
			return;
		}
		int count[] = new int[26];
		//bacb [1,2,1..........0]

		for(int i = 0; i < str1.length(); i++){
			//ASCII codes
			//'a' => 97, b='98'
			//'z' => 122
			count[str1.charAt(i) - 'a']++;
		}
		for(int i = 0; i < str2.length(); i++){
			count[str2.charAt(i) - 'a']--;
		}
		for(int i = 0; i < 26; i++){
			if(count[i] != 0){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}
}