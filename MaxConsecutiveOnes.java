/**
 *
 * @author chandantroughia
 * @date 07/02/2017
 * 
 */

public class MaxConsecutiveOnes {
	
	public static int findMaxConsecutiveOnes(int[] nums){
		
		int ans = 0;
		int temp = 0;
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 1){
				temp++;
				if(ans < temp){
					ans = temp;
				}
			}
			else{
				temp = 0;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {1,1,1,0,1,1,1,1,0,0,0};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
}
