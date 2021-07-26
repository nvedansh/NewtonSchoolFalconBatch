import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//12 5 9 2 4 7 3
		Stack<Long> st = new Stack<>();
		//st = [2, 3]
		for(int i = 0; i < n; i++){
			long x = sc.nextLong(); // 7
			while(!st.empty() && st.peek() >= x){
				st.pop();
			}
			if(st.empty()){
				System.out.print("-1 ");
			}
			else{
				System.out.print(st.peek()+" ");
			}
			st.push(x);
		} //-1 -1 5 -1 2 4 2
	}
}