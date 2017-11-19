/**
 *
 * @author chandantroughia
 * @date 11/04/2017
 * 
 */

package Medium;

public class SearchInRotatedSortedArray {
	
	private static int findNum(int[] nums, int left, int right, int target){
		
		if(left > right) return -1;
		int mid = (right + left)/2;
		
		if(target == nums[mid]) return mid;
		
		if(nums[left] <= nums[mid]){
			if(nums[left] <= target && target < nums[mid]){
				return findNum(nums, left, mid - 1, target);
			}else{
				return findNum(nums, mid + 1, right, target);
			}
		}
		
		else{
			if(nums[mid] <= target && target <= nums[right]){
				return findNum(nums, mid + 1, right, target);
			}else{
				return findNum(nums, left, mid - 1, target);
			}
			
		}
		
	}
	
	private static int findNum(int[] arr, int target) {

		return findNum(arr, 0, arr.length - 1, target);
		
	}

	
	public static void main(String[] args) {
		
		int[] arr = {5,1,3};
		System.out.println(findNum(arr, 3));
		
	}
}
