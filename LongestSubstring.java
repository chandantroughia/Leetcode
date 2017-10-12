import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LongestSubstring{
  public static int lengthOfLongestSubstring(String s){
    if(s == null || s.isEmpty()) return 0;
    
    Map<Character, Integer> lookup = new HashMap<Character, Integer>();
    int start = 0;
    int length = 0;
    
    for(int i = 0; i < s.length(); i++){
      char ch = s.charAt(i);
      
      if(lookup.containsKey(ch) && lookup.get(ch) >= start){
        start = lookup.get(ch) + 1;
        
      }
      
      lookup.put(ch, i);
      length = Math.max(length, i - start + 1);
     //System.out.println(length);
    }
    System.out.println(start);
    System.out.println(s.substring(start-length+1, start+1));
    return length;
    
    
    /*
    //=============================Solution below contains Hash Set not Hash Table========================================
    if(s == null || s.isEmpty()) return 0;
    Set<Character> lookup = new Set<Character>();
    int start = 0;
    int length = 0;
    
    for(int i = 0; i < s.length(); i++){
    	char ch = s.charAt(i);
    	
    	if(lookup.contains(ch)){
    		int j = start;
    		while(s.charAt(j) != ch && j < s.length()){
    			lookup.remove(s.charAt(j));
    			j++;
    		}
    		start = j + 1;
    		
    	}else{
    		lookup.add(ch);
    	}
    	length = Math.max(length, i - start + 1);
    	
    }
    return length;
    */
    		
  }
  
  public static void main(String[] args) {
	  String s = "abcdabcdefgcsedf";
	    System.out.println(lengthOfLongestSubstring(s));
}
 
}


