import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		a[0] = Integer.MAX_VALUE;
		st.push(0);
		for(int i = 1; i <= n; i++){
			a[i] = sc.nextInt();
			while(!st.empty() && a[st.peek()] <= a[i]) 
				st.pop();
			System.out.print(i - st.peek()+" ");
			st.push(i);
		}
	}
}