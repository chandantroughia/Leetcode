import java.util.HashMap;

public class MaxIndexSum {

	public static String findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> one = new HashMap<String, Integer>();
        HashMap<String, Integer> two = new HashMap<String, Integer>();
        
        for(int i = 0; i < list1.length; i++){
            one.put(list1[i], i);
        }
        
        for(int i = 0; i < list2.length; i++){
            if(one.containsKey(list2[i])){
                two.put(list2[i], i);
            }
        }
        
        int min = Integer.MAX_VALUE;
        String ans = "";
        
        for(String str: two.keySet()){
            if(one.containsKey(str)){
                int temp = one.get(str) + two.get(str);
                if(temp < min){
                    min = temp;
                    ans = str;
                }
            }
        }
        
        return ans;
    }
	
}
