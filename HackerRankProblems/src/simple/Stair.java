package simple;

import java.util.Scanner;

public class Stair {
	static void staircase(int n) {
        // Complete this function
        for(int i=1;i<=n;i++)
        {
            int j=1;
            for(;j<=n-i;j++)
            {
                System.out.print(" ");
                
            }
            while(j<=n){
                    System.out.print('#');
                j++;
            }
            System.out.println("");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        staircase(n);
	        in.close();
	}

}
