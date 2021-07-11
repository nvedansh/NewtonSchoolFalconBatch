
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.print(a[0]*a[1]+" ");
	for(int i=1;i<n-1;i++){
	    System.out.print(a[i-1]*a[i+1]+" ");
	}
	System.out.print(a[n-1]*a[n-2]);

}	    


}