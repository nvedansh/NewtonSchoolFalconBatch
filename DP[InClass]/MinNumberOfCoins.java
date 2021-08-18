import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static int minCoins(int[] coins, int n, int value){
        
        int[] dp = new int[value + 1];
        dp[0] = 0 ; //For zero value we will get 0 coins
        //coins = [2,3,5,6], value = 10
        for(int v = 1; v <= value; v++){ //v = 1
            int minValue = Integer.MAX_VALUE;
            for(int coin: coins){
                if(v >= coin){
                    minValue = Math.min(minValue, dp[v - coin]);
                }
            }
            dp[v] = minValue;
            if(minValue != Integer.MAX_VALUE){
                dp[v]++;
            }
        }

        return dp[value];
    }    

	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int value = sc.nextInt();
            int n = sc.nextInt();
            int coins[] = new int[n];
            for(int i = 0; i < n; i++){
                coins[i] = sc.nextInt();
            }
            int ans = minCoins(coins, n, value);
            if(ans == Integer.MAX_VALUE){
                System.out.println("Not Possible");
            }
            else{
                System.out.println(ans);
            }
        }
	}
}