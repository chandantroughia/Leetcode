/**
 *
 * @author chandantroughia
 * @date 07/02/2017
 * 
 */

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

//The below function is valid for non repetetive numbers in the array 
public class DisappearedNumber_448 {

	public static int[] findDisappearedNumbers(int[] arr){
		int size = arr.length + 2;

	    // 1 + 2 + ... + N-1 + N = N * (N + 1) / 2
	    long totalSum = size * (size + 1) / 2;
	       
	    // Sum up the input array
	    long arrSum = 0;
	    for (int i : arr) arrSum += i;
	        
	    // totalSum - arrSum = the sum of the two results. Therefore we know 
	    // that since our two results are not equal, one result is
	    // > (sum of two results) / 2 and the other is 
	    // < (sum of two results) / 2
	    int pivot = (int) ((totalSum - arrSum) / 2);
	       
	    // Use the same technique as oneMissing() on each half of the array.
	    int totalLeftXor = 0;
	    int arrLeftXor = 0;
	    int totalRightXor = 0;
	    int arrRightXor = 0;
	        
	    for (int i = 1; i <= pivot; i++) totalLeftXor ^= i;
	    for (int i = pivot + 1; i <= size; i++) totalRightXor ^= i;
	    for (int i : arr) {
	        if (i <= pivot) arrLeftXor ^= i;
	        else arrRightXor ^= i;
	    }
	        
	    return new int[]{totalLeftXor ^ arrLeftXor, totalRightXor ^ arrRightXor};
	}
	
	/*Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

	Find all the elements of [1, n] inclusive that do not appear in this array. */
	
	public static void forRep(int[] arr){
		System.out.println("Case 2");
		for(int i = 0; i < arr.length; i++){
			int val = Math.abs(arr[i]) - 1;
			if(arr[val] > 0){
				arr[val] = - arr[val];
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > 0){
				System.out.println(i + 1);
			}
		}
		System.out.println("Case 1");
		
	}
	
	public static void main(String[] args) {
		//Case 1
		int[] arr = {1,2,4,6};
		int[] ans = findDisappearedNumbers(arr);
		
		//Case 2 with repetition
		int[] arr2 = {4,3,2,7,8,2,3,1};
		forRep(arr2);
		
		for(int i: ans){
			System.out.println(i);
		}
	}
}
