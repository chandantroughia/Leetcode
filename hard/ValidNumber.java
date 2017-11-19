/**
 *
 * @author chandantroughia
 */

package hard;

import java.util.HashMap;

public class ValidNumber {
	
	
	public static void isNumber2(String s) {
        double db = Double.parseDouble(s);
    }
    
    public static boolean isNumber(String s) {
        try{
            if(s.contains("f")||s.contains("F")||s.contains("d")||s.contains("D")){
                throw new NumberFormatException();
            }
			isNumber2(s);	
		}
		catch(NumberFormatException nfe){
			System.out.println("Wrong number specified :: " + nfe.getCause());
            return false;
		}
        
        return true;
    }
    
	public static void main(String[] args) {
		
		String str = "959440.94f";
		System.out.println(isNumber(str));
	}

}
