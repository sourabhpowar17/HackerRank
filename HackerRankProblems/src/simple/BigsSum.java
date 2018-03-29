package simple;

import java.util.Scanner;

public class BigsSum {
	 static long aVeryBigSum(int n, long[] ar) {
	        // Complete this function
	        Long sum=0L;
	        for(int i=0;i<n;i++)
	            sum+=ar[i];
	        return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
        in.close();
	}

}
