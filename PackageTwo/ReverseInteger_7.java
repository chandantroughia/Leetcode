/**
 *
 * @author chandantroughia
 * @date 07/07/2017
 * 
 */
package PackageTwo;

import java.util.Scanner;

public class ReverseInteger_7 {
	
	public static int reverseInteger(int n){
		long rev = 0;
		while(n != 0){
			rev = rev * 10 + n%10;
			n /= 10;
			if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
		}
		
		return (int) rev;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println(reverseInteger(n));
	}
}
