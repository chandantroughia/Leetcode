/**
 *
 * @author chandantroughia
 * @date 07/03/2017
 * 
 */

package PackageTwo;

import java.util.HashMap;

public class ContainsDuplicate_II_219 {
	
	public static boolean containsDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])){
				int j = map.get(nums[i]);
				if(i - j <= k) return true;
			}
			map.put(nums[i], i);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,4,5,6,1};
		int k = 2;
		System.out.println(containsDuplicate(nums, k));
	}
}
