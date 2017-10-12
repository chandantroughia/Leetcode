/**
 *
 * @author chandantroughia
 * @date 07/07/2017
 * 
 */
public class TwoSum_1 {

	public static int[] twoSum(int[] nums, int target){
		for(int  i = 0; i < nums.length; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[j] == target - nums[i]){
					return new int[] {nums[i], nums[j]};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution"); 
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] ans = twoSum(nums, target);
		
		for(int i:  ans){
			System.out.print(i + " ");
		}
	}
}
