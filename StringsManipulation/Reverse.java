import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i = s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}
}