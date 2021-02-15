package com.cg.alterString;


import java.util.Scanner;

public class Exercise3 {
	static boolean check(char a) {
		if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U') {
			return true;
		}
		else {
			return false;
		}
	}

   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter string: ");
	   String str = sc.next();
	   char b[] = str.toCharArray();
	   int num = str.length();
	   for (int i=0;i<num;i++) {
		   if (!check(b[i])) {
			   int f = (int)b[i];
			   b[i] = (char)(f+1);
		   }
		   else {
			   continue;
		   }
	   }
	   System.out.println(b);
	   
   }   
}