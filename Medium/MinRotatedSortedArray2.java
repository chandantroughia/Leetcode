/**
 *
 * @author chandantroughia
 * @date 11/04/2017
 * 
 */

package Medium;

public class MinRotatedSortedArray2 {
	
	private static int getMin(int[] nums, int left, int right) {

		if(left == right) return nums[left];
		if(right - left == 1) return Math.min(nums[left], nums[right]);
		
		int mid = (right + left)/2;
		
		//If already sorted
		if(nums[left] < nums[right]) return nums[left];
		//Deal with duplicates
		else if(nums[left] == nums[right]) return getMin(nums, left + 1, right);
		//Go right
		else if(nums[left] < nums[mid]) return getMin(nums, mid, right);
		//Go left
		else return getMin(nums, left, mid);
		
	}
	
	private static int getMin(int[] nums) {

		return getMin(nums, 0, nums.length - 1);
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 1, 1, 3};
		System.out.println(getMin(arr));
	}

}
