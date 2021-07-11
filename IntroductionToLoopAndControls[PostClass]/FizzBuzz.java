import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
	
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        fizzbuzz(x);
	}
    
    static void fizzbuzz(int n){
        for(int i=1;i<=n;i++){
                if(i%3==0 && i%5==0){System.out.print("FizzBuzz ");}
                else if(i%5==0){System.out.print("Buzz ");}
                else if(i%3==0){System.out.print("Fizz ");}
                else{System.out.print(i+" ");}
        }
    }
}