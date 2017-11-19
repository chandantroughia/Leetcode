
public class StringPalindrome {

	public static boolean isPalindrome(String s) {
		s = s.trim();
        if(s == null || s.length() == 0) return true;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
        	char ch = s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        
        return sb.toString().trim().equals(sb.reverse().toString().trim());
    }
	
	public static void main(String[] args) {
		String str  = "A man, a plan, a canal: Panama";
		String str2 = "race a car";
		System.out.println(isPalindrome(str));
		//System.out.println(isPalindrome(str2));
	}
	
}
