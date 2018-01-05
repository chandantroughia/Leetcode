package hard;

public class TrappingRainWater {
	
	public static int getReturn(int[] arr){
		
		int left = 0;
		int right = arr.length - 1;
		int left_max = 0;
		int right_max = 0;
		int water = 0;
		
		while(left <= right){
			left_max = Math.max(left_max, arr[left]);
			right_max = Math.max(right_max, arr[right]);
			
			if(left_max < right_max){
				water += left_max - arr[left];
				left++;
			}else{
				water += right_max - arr[right];
				right--;
			}
		}
		return water;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(getReturn(arr));
	}

}
