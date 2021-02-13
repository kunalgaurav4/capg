
package lab1;


import java.util.Scanner;

public class Exercise1 {
   public static void main(String args[]){
      int n = 5;
      System.out.println("Enter a number: ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println("Cube of " + num + " is "+(num*num*num));
   }
}