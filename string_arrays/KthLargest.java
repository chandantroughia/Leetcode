package string_arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
	
	private static int kthLargest(int[] arr, int k){
		PriorityQueue<Integer> q = new PriorityQueue<>(k);
		
		for(Integer i : arr){
			q.offer(i);
			
			if(q.size() > k){
				q.poll();
			}
			
		}
		
		return q.peek();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,5,2,6,7,8};;
		int k = 2;
		
		System.out.println(kthLargest(arr, k));
	}

}
