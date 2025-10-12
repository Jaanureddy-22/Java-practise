import java.util.*;
//import java.lang.*;
//import java.io.*;

class water_park
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        if(w>=60 && h<=130)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        sc.close();
	}
}
