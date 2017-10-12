/**
 *
 * @author chandantroughia
 * @date 07/04/2017
 * @asked Apple, Adobe
 * 
 */

package PackageTwo;

public class ClimbingStairs_70 {

	public static int climbingStairs1(int n) {
		if(n == 1) return 1;
				
		int first = 1;
		int second = 2;
		for(int i = 3; i <= n; i++){
			int third = first + second;
			first = second;
			second = third;
		}
		
		return second;
	}

	
	public static void main(String[] args) {
		int steps = 3;
		System.out.println(climbingStairs1(steps));
	}
}
