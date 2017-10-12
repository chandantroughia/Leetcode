/**
 *
 * @author chandantroughia
 * @date 07/03/2017
 * 
 */

package PackageTwo;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
	
	public static HashSet<Integer> set = new HashSet<Integer>(); 

	public static boolean isHappy(int div){
		while(!set.contains(div)){  // set is used if the div in the sequence is already something we have already gone through and avoid it
			set.add(div);
			int sum = 0;
			int rem = 0;
			while(div != 0){
				rem = div % 10;
				div = div / 10;
				sum += rem * rem;
			}
			
			if(sum == 0) return true;
			else{
				isHappy(sum);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println(isHappy(n));
	}
}
