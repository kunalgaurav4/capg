package lab3;



import java.util.Scanner;
import java.util.Arrays;

public class Exercise8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	
		int num = str.length();
		
		char a[] = str.toCharArray();
		Arrays.sort(a);
		String k = new String(a);
		if (str.equals(k)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}