import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int MAX = 3001;
	public static long MOD = (long) 1e9 + 7;
	public static void main (String[] args) {
        /*
			It is not exactly a 2d table

			[null,null, null, null ......]x 3000
			[[],[],[],[] ......]x 3000
		*/
		ArrayList<Long>[] array = new ArrayList[MAX];
		//int[] array = new int[MAX];
		//[0,0,0,...0]x 3000
		for(int i = 0; i < MAX; i++){
			array[i] = new ArrayList<Long>();
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// n = 3
		/*
			[
				[1l],
				[1l, 1l],
				[1l, 2l, 1l],
				[1l, 3l, 3l, 1l]
			]
		*/	

		for(int i = 0; i <= n; i++){
			for(int j = 0; j <= i; j++){
				if(j == 0 || j == i){
					array[i].add(Long.valueOf(1));
				}
				else{
					array[i].add((array[i-1].get(j-1) + array[i-1].get(j)) % MOD);
				}
			}
		}

		for(int j = 0; j < array[n].size(); j++){
			System.out.print(array[n].get(j) + " ");
		}
	}
}