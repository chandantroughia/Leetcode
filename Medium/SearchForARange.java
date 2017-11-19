package Medium;

public class SearchForARange {

	public static int[] searchRange(int[] nums, int target) {
        int start = findStart(nums, target);
        int end = findEnd(nums, target);
        return new int[]{start, end};
    }
    
    private static int findEnd(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target){
            	System.out.println("End: " + mid);
            	return mid;
            }
        }
        return -1;
    }
    
    /*private static int findStart(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            if(nums[mid] == target) {
            	System.out.println("Start: " + mid);
            	return mid;
            }
        }
        
        return -1;
    }*/
    
    private static int findStart(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }
    
    public static void main(String[] args) {
    	int[] arr = {5,7,7,8,8,10};
		int[] ans = searchRange(arr, 8);
		System.out.println(ans[0] + " " + ans[1]);
	}
    
}
