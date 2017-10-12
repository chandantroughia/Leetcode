/**
 *
 * @author chandantroughia
 * @date 07/06/2017
 * 
 */
package PackageTwo;

public class RemoveDulicateSortedArray_26 {

	private static int removeDuplicate(int[] nums) {
        int i = 1;
        for (int j = 1; j < nums.length; j++)
            if (nums[j] != nums[i-1]){
            	nums[i++] = nums[j];
            }
        
        return i;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4};
		System.out.println(removeDuplicate(arr));
		for(int i: arr){
			System.out.println(i);
		}
	}
}
