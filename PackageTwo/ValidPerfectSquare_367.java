/**
 *
 * @author chandantroughia
 * @date 07/04/2017
 * 
 */

package PackageTwo;

import java.util.Scanner;

public class ValidPerfectSquare_367 {
	
	public static boolean isPerfectSquare(int n){
		for(int i = 1; i*i <= n; i++){
			if(i*i == n && n%i == 0){ //---> if square of i is equal to n (and n mod i is equal to zero) --> i think this is not necessary
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println(isPerfectSquare(n));
	}
}