package medium;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerCalculation {
	static void extraLongFactorials(int n) {
        // Complete this function
		 // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
 
        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));
 
        System.out.println(f);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
