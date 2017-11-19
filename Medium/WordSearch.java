package Medium;
import java.util.*;

public class WordSearch {
	
	private static boolean getAns(char[][] arr1, char[] arr2) {

		HashMap<Character, Integer> theMap = new HashMap<>();
		
		for(int i = 0; i < arr1.length; i++){
			for(int j = 0 ; j < arr1[i].length; j++){
				char ch = arr1[i][j];
				theMap.put(ch, theMap.getOrDefault(ch, 0) + 1);
			}
		}
		System.out.println(theMap.values());
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(theMap.values());
		//System.out.println(list);
		for(Integer num: list){
			count += num;
		}
		
		if(count < arr2.length){
			return false;
		}
		
		
		
		for(char key: arr2){
            if(theMap.containsKey(key)){
                if(theMap.get(key) == 1) {
                	theMap.remove(key);
                }
                else{
                    
                	theMap.put(key, theMap.get(key) - 1);
                }
                
            }
            else{
                return false;
            }
        }
		
		System.out.println(theMap.values());
        
        return true;
	}

	
	public static void main(String[] args) {
		char[][] arr1 = {{'A','B','C'},{'E','S','F','C'},{'S','A','D','E','E'}};
		char[][] arr2 = {{'a','a'}};
		char[][] arr3 = {{'a','b'},{'c','d'}};
		
				
		String str1 = "ABCCED";
		String str2 = "aaa";
		String str3 = "abcd";

		
		
		//System.out.println(getAns(arr1, str1.toCharArray()));
		//System.out.println(getAns(arr2, str2.toCharArray()));
		System.out.println(getAns(arr3, str3.toCharArray()));
	}
	
	
}
