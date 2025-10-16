import java.util.*;
import java.lang.*;
import java.io.*;

class Literacy_rate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int p = sc.nextInt();
		    int l = sc.nextInt();
		    if(((double)l/p*100) >= 75)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
		sc.close();
		

	}
}
