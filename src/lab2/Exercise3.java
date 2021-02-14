package lab2;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise3
{
public static void main(String[] args)
{
int n;
Scanner s = new Scanner(System.in);
System.out.println("Enter no of elements:");
n = s.nextInt();
int a[] = new int[n+1];

System.out.println("Enter all the elements:");

for(int i = 0; i < n; i++)
{
a[i] = s.nextInt();
}
System.out.print("Reversed array is : ");
for(int i = n-1; i >= 0; i--)
{
	
System.out.print(a[i] + " ");
}


}
}