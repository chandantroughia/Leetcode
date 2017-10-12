import java.util.HashSet;
//
public class HappyNumber {
public static HashSet<Integer> set = new HashSet<Integer>();
    public static boolean isHappy(int dividend) {
            while(!set.contains(dividend)){
                set.add(dividend);
                int sum=0;
                int remainder = 0;
                while(dividend != 0){
                    remainder = dividend%10;
                    dividend = dividend/10;
                    sum += remainder*remainder;
                    System.out.println(dividend);
                }
                
                if(sum == 1){
                return true;
                 }
                else{
                    return isHappy(sum);
                    }
        }
            return false;
    }
    
    
    public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}