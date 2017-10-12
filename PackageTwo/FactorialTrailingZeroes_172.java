/**
 *
 * @author chandantroughia
 * @date 07/06/2017
 * 
 */
package PackageTwo;

import java.util.Scanner;

public class FactorialTrailingZeroes_172 {

	private static int trailingZeros(int n){
		int r = 0;
		while(r < n){
			n = n/5;
			r = r + n;
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(trailingZeros(n));
	}
}
