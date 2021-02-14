package lab1;

import java.util.Scanner;
public class Exercise8 {


	public static void main(String details[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		double value = Math.log(num);
		double log2_value = Math.log(2);
		double check = value/log2_value;
		if (check == (int)check) {
			System.out.println("Power of two");
		}
		else {
			System.out.println("Not");
		}
	}
}