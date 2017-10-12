/**
 *
 * @author chandantroughia
 * @date 07/03/2017
 * 
 */

import java.util.HashSet;

public class ContainsDuplicate_217 {
	
	public static boolean containsDuplicate(int[] nums){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i: nums){
			if(set.contains(i)) return true;
			set.add(i);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,1};
		System.out.println(containsDuplicate(nums));
	}
}
