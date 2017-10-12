/**
 *
 * @author chandantroughia
 * @date 07/02/2017
 * 
 */
public class FindTheDifference_389 {

	public static char Diff(String s, String t){
	
		int code = t.charAt(s.length());
		for(int i = 0; i < s.length(); i++){
			code ^= (int)(s.charAt(i));
			code ^= (int)(t.charAt(i));
		}
		
		return (char)code;
	}
	
	public static void main(String[] args) {
		String s = "abcde";
		String t = "abcfde";
		
		System.out.println(Diff(s, t));
	}
}
