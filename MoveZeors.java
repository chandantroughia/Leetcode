/**
 *
 * @author chandantroughia
 * @date 07/02/2017
 * 
 */
public class MoveZeors {

	public static int[] moveZeros(int[] nums){
		int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        
        for(int k = i;  k < nums.length; k++){
            nums[k] = 0;
        }
		
		return nums;
	}
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
		nums = moveZeros(nums);
		
		for(int i: nums){
			System.out.println(i);
		}
	}
}
