package simple;

import java.util.Scanner;

public class MinMaxSum {
	static void miniMaxSum(int[] arr) {
        // Complete this function
        int big=arr[0],small=arr[0];
        Long sum=0L;
        for(int i=0;i<arr.length;i++)
        {            
            if(arr[i]>big)
                big=arr[i];
            if(arr[i]<small)
                small=arr[i];
            sum+=arr[i];
        }
        System.out.print(sum-Long.parseLong(String.valueOf(big)));
        System.out.print("  ");
        System.out.println(sum-Long.parseLong(String.valueOf(small)));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int[] arr = new int[5];
	        for(int arr_i = 0; arr_i < 5; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        miniMaxSum(arr);
	        in.close();
	}

}
