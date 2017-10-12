/**
 *
 * @author chandantroughia
 * @date 07/03/2017
 * 
 */

package PackageTwo;

public class ReverseString_II_541 {
	
	public static String reverseStr(String s, int k){
		char[] letters = s.toCharArray();   //convert the String to char array
		int n = letters.length;
		int i = 0;
		while(i < n){
			int j = Math.min(i + k - 1, n - 1);
			swap(letters, i, j);
			i += 2 * k;
		}
		return String.valueOf(letters);
	}
	
	private static void swap(char[] arr, int i, int j){
		if(i < j){
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		String s = "chandan";
		int k = 3;
		
		System.out.println(reverseStr(s,k));
	}
}
