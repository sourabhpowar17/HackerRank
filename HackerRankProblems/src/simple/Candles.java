package simple;

import java.util.Scanner;

public class Candles {

	 static int birthdayCakeCandles(int n, int[] ar) {
	        // Complete this function
		 int big=0,count=0;
		 
		 for(int i=0;i<ar.length;i++)
	        {            
	            if(ar[i]>big)
	                big=ar[i];
	        }

		 for(int i=0;i<ar.length;i++)
	        {            
	            if(ar[i]==big)
	                count++;
	        }
		 
		 return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
        in.close();
	}

}
