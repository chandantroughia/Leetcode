/**
 *
 * @author chandantroughia
 * @date 07/03/2017
 * 
 */

package PackageTwo;

import java.util.Scanner;

public class PowerOfTwo_231 {

	public static boolean isPowerOfThree(int n){
		if(n <= 0) return false;
		while(n % 2 == 0){
			n = n / 2;
		}
		
		return n == 1;
	}

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println(isPowerOfThree(n));
	}
}
