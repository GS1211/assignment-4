import java.util.*;
public class Abc
{
public static void main(String[] x)
{
Scanner a=new Scanner(System.in);
int i,j,n;
n=a.nextInt();
for(i=n;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.print("\n");
}}}
