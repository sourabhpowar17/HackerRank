package simple;

import java.util.Scanner;

public class CountFraction {


    static void plusMinus(int[] arr) {
        // Complete this function
        int countx=0,county=0,countz=0;
        for(int i=0;i<arr.length;i++)
        {


            if(arr[i]==0) {
                countx++;
                System.out.println("=0  "+countx);}
            else if(arr[i]>0)
            {
                county++;
                System.out.println(">0  "+county);}
            else
            {
                countz++;
                System.out.println("<0  "+countz);}
            
        }
        System.out.println(countx+"===="+county+"===="+countz+"===="+arr.length);
        System.out.println(String.format( "%.4f", (double)county/arr.length ));
        System.out.println(String.format( "%.4f", (double)countz/arr.length ));
        System.out.println(String.format( "%.4f", (double)countx/arr.length ));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int arr_i = 0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        plusMinus(arr);
	        in.close();
	}

}
