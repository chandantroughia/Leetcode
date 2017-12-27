package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {
	
	private static ArrayList<ArrayList<String>> groupAnagrams(String[] arr){
		//ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		for(String s: arr){
			char tempArray[] = s.toCharArray();
			Arrays.sort(tempArray);
			String temp = new String(tempArray);
			
			if(!map.containsKey(temp)){
				map.put(temp, new ArrayList<String>());
			}
			map.get(temp).add(s);
		}
		return new ArrayList<ArrayList<String>>(map.values());
	}
	
	public static void main(String[] args) {
		String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		ArrayList<ArrayList<String>> ans = groupAnagrams(str);
		
		ArrayList<String> answer = null;
		int len = 0;
		for(ArrayList<String> s : ans){
			if(len < s.size()){
				len = s.size();
				answer = s;
			}
		}
		System.out.println(answer);
	}

}
