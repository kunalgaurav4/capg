package lab1;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int input = sc.nextInt();
		int n1 = 1,n2 = 1,n3 = 0;
		int ans = 0;
		for(int i = 0;i<input;i++) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;			
		}	
		System.out.println(n3);
	}

}
