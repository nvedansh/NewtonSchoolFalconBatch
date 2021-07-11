import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//ABCDCZA
		int i = 0; //i = 0
		int j = str.length()-1; //j = 6
		
		while(i < j){
			if(str.charAt(i) != str.charAt(j)){
				System.out.println(0);
				return;
			}
			i++;
			j--;
		}
		System.out.println(1);

	}
}