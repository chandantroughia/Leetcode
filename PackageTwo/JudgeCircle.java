/**
 *
 * @author chandantroughia
 */

package PackageTwo;

import java.util.HashMap;

public class JudgeCircle {
	
public static boolean judgeCircle(String moves) {
        
        int countL = 0 , countR = 0, countU = 0, countD = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0 ; i < moves.length(); i++){
        	if(map.containsKey(moves.charAt(i))){
        		map.put(moves.charAt(i), map.get(moves.charAt(i)) + 1);
        	}
        	else{
        		map.put(moves.charAt(i), 1);
        	}
        }
        
        for(Character ch: map.keySet()){
        	
            if(ch == 'L') countL = map.get(ch);
            if(ch == 'R') countR = map.get(ch);
            if(ch == 'D') countD = map.get(ch);
            if(ch == 'U') countU = map.get(ch);
        }
        
        return countL == countR && countU == countD;
        
    }

 	public static void main(String[] args) {
	
 		String str = "LDRRLRUULR";
 		System.out.println(judgeCircle(str));
 	}

}
