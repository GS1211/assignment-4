import java.util.*;
public class Star
{
   public static void main (String[] args)
   {		Scanner a=new Scanner(System.in);

       int i =0;
       int num =0;
int n;
n=a.nextInt();
       
       String  primeNumbers = "";

       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	   
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to n are :");
       System.out.println(primeNumbers);
   }
}

