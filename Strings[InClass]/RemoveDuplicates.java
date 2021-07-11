import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
			2
			hello
			helloworld
		*/

		int t = sc.nextInt(); //2
		sc.nextLine(); //'\n'
		HashMap<Character, Integer> hm = new HashMap<>();
		/*
			hm = [{}]

		*/
		while(t-- > 0){
			String str = sc.nextLine(); //helloworld
			hm.clear();
			for(int i = 0; i < str.length(); i++){
				if(!hm.containsKey(str.charAt(i))){
					System.out.print(str.charAt(i)); //helo
					hm.put(str.charAt(i), 1);
				}
			}
			System.out.println();
		}
	}
}