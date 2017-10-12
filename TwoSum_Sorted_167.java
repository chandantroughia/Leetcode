/**
 *
 * @author chandantroughia
 * @date 07/02/2017
 * 
 */

public class TwoSum_Sorted_167 {

	public static int[] twoSum2(int[] nums, int target){
		if(nums == null || nums.length == 0) return null;
		int i = 0;
		int j = nums.length - 1;
		
		while(i < j){
			int sum = nums[i] + nums[j];
			if(sum > target) j--;
			else if(sum < target) i++;
			else return new int[] {i + 1, j + 1};
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] ans = twoSum2(nums, target);
		
		for(int i:  ans){
			System.out.println(i);
		}
	}
}