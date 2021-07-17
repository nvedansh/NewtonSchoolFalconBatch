import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int matrix[][] = new int[m][n];

		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}

        int ans = 0, count = n;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(matrix[i][j] == 1){
                    if(count > j){
                        ans = i;
                        count = j;
                    }
                }
			}
		}     
        System.out.println(ans);  
	}
}