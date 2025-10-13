import java.util.*;
import java.lang.*;
import java.io.*;

class chef_&_chocolates
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int c=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    System.out.println((c-x)*y);
		}

	}
}
