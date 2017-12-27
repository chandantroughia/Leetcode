package string_arrays;

import java.util.HashMap;

public class IsomorphicStrings {
	
	private static boolean isIsomorphic(String s, String t){
		
		if(s.length() != t.length()) return false;
		
		HashMap<Character, Character> theMap = new HashMap<Character, Character>();
		
		for(int i = 0; i < s.length(); i++){
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			
			if(theMap.containsKey(c1)){
				if(theMap.get(c1) != c2){
					return false;
				}
			}else{
				if(theMap.containsValue(c2)){
					return false;
				}
				theMap.put(c1, c2);
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		String s = "add";
		String t = "egg";
		System.out.println(isIsomorphic(s, t));
	}

}
