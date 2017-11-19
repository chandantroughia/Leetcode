package Medium;

public class MergeSortedArrays {
	
	private static void printArray(int[] ans) {
		for(int l: ans){
			System.out.print(l + " ");
		}
	}

	public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[n+m]; //make new array with the combined size of both input arrays
        int i = 0, j = 0, k = 0;
        
        while(i < m && j < n){
        	//Our checks
        	if(nums1[i] < nums2[j]){
        		ans[k++] = nums1[i++];
        	}else{
        		ans[k++] = nums2[j++];
        	}
        }
        
        //Add remaining elements
        while(i < m){
        	ans[k++] = nums1[i++];
        }
        
        while(j < n){
        	ans[k++] = nums2[j++];
        }
        
        printArray(ans);
    }


	public static void main(String[] args) {
		int[] arr1 = {0};
        int m = arr1.length;
     
        int[] arr2 = {1};
        int n = arr2.length;
     
         
        mergeArrays(arr1, m, arr2, n);
	}

}
