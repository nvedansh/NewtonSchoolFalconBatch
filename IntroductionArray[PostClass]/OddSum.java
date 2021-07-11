
import java.util.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int a[] = new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int sum=0;
	    for(int i=0;i<n;i++){
	       if(a[i]%2==1){
	           sum+=a[i];
	       }
	    }
	    System.out.print(sum);

	}
}
