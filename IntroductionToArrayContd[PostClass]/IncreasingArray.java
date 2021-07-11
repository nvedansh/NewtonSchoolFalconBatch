import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}

		int cnt=2;
		for(int i=1;i<n;i++){
			while(cnt<=a[i] && a[i]%cnt!=0){
				cnt++;
			}
			if(cnt>a[i]){
				System.out.println("NO");
				return;
			}
			cnt++;
		}
		System.out.println("YES");
	}
}