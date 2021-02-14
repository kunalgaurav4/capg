package lab2;

import java.util.Arrays;


public class Exercise1 {
   public static void main(String args[]){
	   
      int array[] = {10,5, 20, 25, 63, 96, 57};
      
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      int res = array[1];
      System.out.println("2nd smallest element is ::"+res);
   }
}