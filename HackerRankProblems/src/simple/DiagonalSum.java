package simple;

import java.util.Scanner;

public class DiagonalSum {

	
	static int diagonalDifference(int[][] a) {
        // Complete this function
		int sum1=0,sum2=0;
        for(int i=0;i<a.length;i++)
        	for(int j=0;j<a[i].length;j++)
        	{
        		if(i==j)
        			sum1+=a[i][j];
        		if(j==(a[i].length-i-1))
        			sum2+=a[i][j];
        		
        		
        	
        	}
        //System.out.println(sum1+"====="+sum2);
        
        return Math.abs(sum1-sum2);
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
	}

}
