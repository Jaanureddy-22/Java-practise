import java.util.*;
//import java.lang.*;
//import java.io.*;

class Bob_at_bank
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int w=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            System.out.println(w+((x-y)*z));
        }
           sc.close(); 

	}
}
