import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    /**
        4 10 4 2 => 3
        N = 4 (Total number of player)
        M = 10 (Total Magic pills)
        X = 4 (Number of pills neeeded to make a player fit)
        Y = 2 (Number of pills we get if we retire a player)

        10 / 4 => 2 players, 2 pills is left, 
        1 player are left, 2 more pills
        3 players at maximum

        0, 1, 2, 3, 4
        left = 0, right = 4
        mid = 4 / 2 = 2

        if X*mid <= M + (n-mid)*y => true, I can treat mid people
            //How many people will be left => n-mid
            solution = mid;
            left = mid + 1; 
        else
            right = mid - 1;    
        
        

    **/
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        long left = 0, right = n;//(4, 3)
        long sol = 0;
        //4 10 4 2
        while(left <= right){
            long mid = left + (right - left) / 2; //mid = 4
            /*
                How many pills do we need? x * mid = 16
                How many do we have initially? m = 10
                How many pills can we get if we treat mid people?
                (n-mid)*y = 0*2 = 0
            */
            if(x*mid <= m + (n - mid)*y){
                sol = mid; //solution mid, 3
                left = mid + 1;//left = 4
            }
            else{
                right = mid - 1; //right = 3
            }
        }
        System.out.println(sol); //3
	}
}