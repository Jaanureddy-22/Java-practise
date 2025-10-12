import java.util.*;
//import java.lang.*;
//import java.io.*;

class Codechef_Airlines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		   int  x=sc.nextInt();
		   int  y=sc.nextInt();
		   int  z=sc.nextInt();
		    if(y<=10*x)
		    {
		        System.out.println(y*z);
		    }
		    else{
		        System.out.println(10*x*z);
		    }
		}
           sc.close();
	}
}
