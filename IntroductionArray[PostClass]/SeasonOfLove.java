
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans = n/3;
		if(n%3==2){ans++;}
		System.out.print(ans);
	
	}	    


}