/**
 *
 * @author chandantroughia
 * @date 11/04/2017
 * 
 */

package Medium;

//Without duplicates

public class MinRotatedSortedArray1 {
	
	private static int getMin(int[] nums, int left, int right) {

		if(left == right) return nums[left];
		
		if(right - left == 1) return Math.min(nums[left], nums[right]);
		
		int mid = (right + left)/2;
		
		//If sorted
		if(nums[left] < nums[right]) return nums[left];
		else if(nums[mid] > nums[left]) return getMin(nums, mid, right);
		else return getMin(nums, left, mid);
		
	}
	
	private static int getMin(int[] nums) {

		return getMin(nums, 0, nums.length - 1);
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 1, 2, 3};
		System.out.println(getMin(arr));
	}

}
