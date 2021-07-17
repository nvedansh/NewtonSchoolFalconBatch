import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int matrix[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		/*
			1 2 3
			4 5 6
			7 8 9

			primeDiagonal = 6, secondDiagonal = 8
			i = 1, j = 1

		*/	

		int primeDiagonal = 0, secondDiagonal = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j){
					primeDiagonal += matrix[i][j];
				}
				if(i+j == n - 1){
					secondDiagonal += matrix[i][j];
				}
			}
		}
		System.out.println(primeDiagonal + " " +secondDiagonal);
	}
}