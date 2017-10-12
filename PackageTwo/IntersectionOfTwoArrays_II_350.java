/**
 *
 * @author chandantroughia
 * @date 07/03/2017
 * 
 */
package PackageTwo;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays_II_350 {

	
	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < nums1.length; i++){
			if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i]) + 1);
			else map.put(nums1[i], 1);
		}
		
		for(int i = 0; i <  nums2.length; i++){
			if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
				result.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		
		int[] res = new int[result.size()];
		for(int i = 0; i < result.size(); i++){
			res[i] = result.get(i);
		}
		
		return res;
		
	}
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2,2};
		
		int[] nums = intersect(nums1, nums2);
		
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
		
	}
}
