import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			HashMap<Character, Integer> ss = new HashMap<>();
			char A[] = new char[n];
			int B[] = new int[n];
			String str[] = sc.nextLine().strip().split(" ");
			ArrayList<Character> keys = new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				A[i] = str[i].charAt(0);
				keys.add(A[i]);
			}
			Collections.sort(keys);
			int cnt=0;
			for(int i=0;i<n;i++)
			{
				B[i] = sc.nextInt();
				ss.put(A[i], B[i]);
				cnt=Math.max(cnt,B[i]);
			}
			for(Character it : keys)
			{
               	System.out.println(it +" "+ss.get(it));
			}
			System.out.println(cnt);
		}
	}
}