import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Pair{
	long first;
	long second;
	Pair(long first, long second){
		this.first = first;
		this.second = second;
	}
}

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Pair> s = new Stack<>();
		Stack<Pair> s1 = new Stack<>();

		long a[] = new long[n];
		long b[] = new long[n];

		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
			while(!(s.empty())){
					if(s.peek().first>a[i]){
						break;
					}
				s.pop();
			}
		    if(s.empty()){
				b[i]=-1l;
			}
			else{
				b[i]=s.peek().second+1;
			}
			Pair p = new Pair(a[i], i);
			s.push(p);
		}

		for(int i=n-1;i>=0;i--){
			while(!(s1.empty())){
				if(s1.peek().first>a[i]){
					break;
				}
				s1.pop();
			}
			if(s1.empty()){
				b[i]+=-1;
			}
			else{
				b[i]+=s1.peek().second+1;
			}
			Pair p = new Pair(a[i], i);
			s1.push(p);
		}

		for(int i=0;i<n;i++){
			System.out.print(b[i]+" ");
		}

	}
}