
public class ProductSelfExcept {

	
	public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i = 1; i < n; i++){
            result[i] = result[i-1]*nums[i-1];
            System.out.println(result[i-1] + " * " + nums[i-1] + " = " + result[i]);
        }
        print(result);
        System.out.println();
        int right = 1;
        for(int i = n-1; i>=0; i--){
            result[i] *= right;
            right *= nums[i];
            
            System.out.println(right);
        }
        
        return result;
    }
	
	public static void print(int[] arr){
		for(int i: arr){
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] result = productExceptSelf(arr);
		print(result);
	}
}
