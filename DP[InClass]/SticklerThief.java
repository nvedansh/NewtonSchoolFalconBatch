import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static int maxLoot(int houses[], int n, int[] dp){
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);
        for(int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + houses[i]);
        }
        return dp[n-1];
    }

    //sc.nextInt(); //regex parsing
    // ..5 25.......
    //br.readLine(); //fast
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        int houses[] = new int[10001];
        int dp[] = new int[10001];
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                houses[i] = Integer.parseInt(str[i]);
            }
            System.out.println(maxLoot(houses, n, dp));
        }

	}
}