/**
 *
 * @author chandantroughia
 * @date 07/04/2017
 * @asked Apple, Adobe
 * 
 */

package PackageTwo;

import java.util.Arrays;

public class ArrayPairSum {

	
	public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            i++;
        }
        
        return sum;
        
    }
	
	public static void main(String[] args) {
		int[] nums = {2,4,3,5,6,7,8,11};
		System.out.println(arrayPairSum(nums));
	}
	
}
