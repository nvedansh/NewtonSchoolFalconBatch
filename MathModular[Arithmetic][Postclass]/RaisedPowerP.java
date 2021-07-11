import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	static long mod = (long) 1e9 + 7;


	static long[][] mul(long [][] A, long[][] B, int n){
		
		/*
		A = 
			[[1 0 0]
			[1 1 1]
			[0 1 0]]
		B = 
			[[1 0 0]
			[1 1 1]
			[0 1 0]]

		result = 
			[[1 0 0]
			[2 2 1]
			[1 1 1]]

		*/


		long result[][] = new long[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					result[i][j] = ((result[i][j] % mod) + ((A[i][k] * B[k][j]) % mod)) % mod;
				}
			}
		}
		return result;
	}

	static long[][] pow(long matrix[][], int n, long p){
		long result[][] = new long[n][n];
		for(int i = 0; i < n; i++){
			result[i][i] = Long.valueOf(1);
		}
		/*
			result = 
			[1 0 0]
			[0 1 0]
			[0 0 1]

			matrix = 
			[[1 0 0]
			[1 1 1]
			[0 1 0]]
			
			4
		*/

		while(p > 0){
			if(p % 2 == 1){
				result = mul(result, matrix, n); //result = matrix ^ 4
			}	
			matrix = mul(matrix, matrix, n); // matrix^4
			p /= 2; //p = 1
		}

		return result; // matrix ^ 4
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long p = sc.nextLong();
		
		long matrix[][] = new long[n][n];
		/*
			[
				[3 ,4, 5,... n],
				[3 ,4, 5,... n],
				[3 ,4, 5,... n],
				..
				..
				[3 ,4, 5,... n],
			]

			matrix[0] = [3 ,4, 5,... n](first row)
			matrix[0][1] = 4(first row)(second column)
			O(n^3logp)
			
			matrix = 
			[[1 0 0]
			[1 1 1]
			[0 1 0]]
			
			4
		*/

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = sc.nextLong();
				matrix[i][j] %= mod;
			}
		}

		long[][] result = pow(matrix, n, p);

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}