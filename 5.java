

import java.util.*;
public class Star
{
    public static void main(String args[])
    {
        int n, nu, num=0, rem;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any Positive Number : ");
        n = scan.nextInt();
		
        nu=n;
		
        while(nu != 0)
        {
            rem = nu%10;
            num = num*10 + rem;
            nu = nu/10;
        }
     System.out.println(num);   
    }
}
