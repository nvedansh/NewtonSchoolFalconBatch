import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Long> qu = new LinkedList<>();
        qu.add(1l);
        while(n-- > 0){
            Long x = qu.poll();
            System.out.print(x+ " ");
            qu.add(10*x);
            qu.add(10*x + 1);
        }
	}
}