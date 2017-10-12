/**
 *
 * @author chandantroughia
 * @date 07/03/2017
 * 
 */

package PackageTwo;

import java.util.Scanner;

public class PowerOfThree_326 {
	
	public static boolean isPowerOfThree(int n){
		if(n <= 0) return false;
		while(n % 3 == 0){
			n = n / 3;
		}
		
		return n == 1;
	}

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println(isPowerOfThree(n));
	}
}
