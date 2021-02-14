package lab2;

import java.util.Scanner;

public class Exercise4 {
    public static int[] modifyArray (int arr[]){
        
        int j = 0;
        int i = 1;
        if(arr.length < 2){
            return arr;
        }
        while(i < arr.length){
            if(arr[i] == arr[j]){
                i++;
            }else{
                arr[++j] = arr[i++];
            }    
        }
        int[] arrout = new int[j+1];
        for(int k=0; k<arrout.length; k++){
            arrout[k] = arr[k];
        }
         
        return arrout;
    }
public static void main(String[] args) {
		// TODO Auto-generated method stub

			int i,n;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			int arr[]=new int[n];
			
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int arrout[]=modifyArray (arr);
			
			  for(int j:arrout)
			  { 
				  System.out.print(j+" "); 
				  
			  }	

	}

}