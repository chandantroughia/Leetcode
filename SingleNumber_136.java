/**
 *
 * @author chandantroughia
 * @date 07/02/2017
 * 
 */

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber_136 {

	public static int singleNumber(int[] nums){
		/*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int x = 1;
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])){
				map.put(nums[i], x +1);
			}
			else{
				map.put(nums[i], x);
			}
		}
		
		int ans = 0;
		for(Integer key: map.keySet()){
			if(map.get(key) == 1){
				ans = key;
			}
		}
	
		return ans;*/
		
		//-----------------------------------------Alternate Answer-------------------------------------
		/*int i = 0;
		Arrays.sort(nums);
		for(; i < nums.length; i++){
			if(nums[i] == nums[i+1]){
				i++;
			}else{
				break;
			}
		}
		return nums[i];*/
		
		//---------------------------------------XOR Solution---------------------------------------------
		int x = 0;
        for (int n : nums) {
        	//System.out.print(x + " ^ " + n);
            x = x ^ n;
            //System.out.println("--" + x);
        }
        return x;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,3,4,5,4,5};
		System.out.println(singleNumber(arr));
	}
}
