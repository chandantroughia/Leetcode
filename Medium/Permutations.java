package Medium;
import java.util.*;

public class Permutations {

	static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	private static void addArr(int[] arr){
		
		ArrayList<Integer> temp = new ArrayList<Integer>(arr.length);
		for(int i: arr){
			temp.add(Integer.valueOf(i));
		}
		ans.add(temp);
		
		
	}
	private static void getPermutations(int[] arr, int left, int right){
		if(left == right) {
			addArr(arr);
			//System.out.println();
		}
		else{
			for(int i = left;  i <= right; i++){
				arr = swap(arr, left, i);
				getPermutations(arr, left + 1, right);
				arr = swap(arr, left, i);
			}
		}
	}

	private static int[] swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return arr;
	}
	
	public static void getPermutations(int[] arr){
		getPermutations(arr, 0, arr.length - 1);
	}
	
	
	public static void main(String[] args) {
		int[] arr  = {1,2,3};
		getPermutations(arr);
		System.out.println(ans);
	}
}
