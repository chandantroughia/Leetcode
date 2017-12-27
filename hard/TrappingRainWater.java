package hard;

public class TrappingRainWater {
	
	public static int getReturn(int[] arr){
		
		int left = 0;
		int right = arr.length - 1;
		int left_max = 0;
		int right_max = 0;
		int ans = 0;
		
		while(left < right){
			
			if(arr[left] < arr[right]){
				
				if(arr[left] >= left_max){
					left_max = arr[left];
				}else{
					ans += left_max - arr[left];
				}
				left++;
			}
			else
			{
				if(arr[right] >= right_max){
					right_max = arr[right];
				}else{
					ans += right_max - arr[right];
				}
				right--;
			}
		}
		
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(getReturn(arr));
	}

}
