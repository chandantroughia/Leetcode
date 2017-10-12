/**
 *
 * @author chandantroughia
 * @date 07/03/2017
 * 
 */
package PackageTwo;

public class RemoveElement_27 {

	public static int removeElement(int[] arr, int val){
		
		int i = 0;
		for(int j = 0; j < arr.length; j++){
			if(arr[j] != val){
				arr[i] = arr[j];
				i++;
			}
		}
		
		return i;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {3,2,2,3};
		int val = 3;
		
		System.out.println(removeElement(arr,val));
		
	}
	
}
