/**
 *
 * @author chandantroughia
 * @date 07/02/2017
 * 
 */

import java.util.Scanner;

public class NumberOfOnesInBinary {
	
	public static int Ones(int x) {
	    int sum = 0;
	    while (x > 0) {
	        sum += x & 1;
	        x >>= 1;
	    }
	    return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(Ones(x));
	}
}
