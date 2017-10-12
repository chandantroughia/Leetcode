/**
 *
 * @author chandantroughia
 * @date 07/03/2017
 * 
 */
package PackageTwo;

import java.util.Scanner;

public class UglyNumber_263 {
	
	public static boolean isUgly(int n){
		if(n <= 0) return false;
		int[] nums = {2,3,5};
		
		for(int i = 0; i < nums.length; i++){
			while(n % nums[i] == 0){
				n = n / nums[i];
			}
		}
		
		return n == 1;
	}

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println(isUgly(n));
	}
}
