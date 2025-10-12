import java.util.*;
//import java.lang.*;
//import java.io.*;

class codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int Na = sc.nextInt();
            int Nb = sc.nextInt();
            int Nc = sc.nextInt();

            if(Na > Nb + Nc || Nb > Na + Nc || Nc > Na + Nb){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}