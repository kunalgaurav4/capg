package lab1;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String details[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers seprated by space: ");
		int input = sc.nextInt();
		String str1 = String.valueOf(input);
		char check1 [] = str1.toCharArray();
		Arrays.sort(check1);
		String str2 = new String(check1);
		if (str1.equals(str2)) {
			System.out.println("Increasing order");
		}
		else {
			System.out.println("Not Increasing");
		}
		
	}

}
