import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args)throws Exception {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            double X = Double.parseDouble(str[0]);
            int N = Integer.parseInt(str[1]);
            
            System.out.println(String.format("%.2f", myPow(X, N)));
        }
    }
    
    public static double myPow(double x, int n) {
        // if (n == Integer.MIN_VALUE)
        //     n = - (Integer.MAX_VALUE - 1); 
        if (n == 0)
            return 1.0;
        else if (n < 0)
            return 1 / myPow(x, -n);
        else if (n % 2 == 1)
            return x * myPow(x, n - 1);
        else {
            double sqrt = myPow(x, n / 2);
            return sqrt * sqrt;
        }
    }
}