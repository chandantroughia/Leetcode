package string_arrays;

public class LongestPalindromicSubstring {
	
	private static void printSubStr(String str, int start, int end){
	    System.out.println(str.substring(start, end));
	  }

	  private static int getLongestPalindrome(String str){
	    int maxLength = 1;
	    int start = 0;

	    int len = str.length();
	    int low, high;

	    for(int i = 1; i < len; i++){
	    //for even length
	      low = i - 1;
	      high = i;

	      while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)){
	        if(high - low + 1 > maxLength){
	          start = low;
	          maxLength = high - low + 1;
	        }
	        low--;
	        high++;
	      }
	      
	      //for odd length
	      low = i - 1;
	      high = i + 1;

	      while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)){
	        if(high - low + 1 > maxLength){
	          start = low;
	          maxLength = high - low + 1;
	        }
	        low--;
	        high++;
	      }
	    }
	    printSubStr(str, start, start + maxLength);
	    return maxLength;
	  }
	
	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
		int length  = getLongestPalindrome(str);
		System.out.println(length);
	}
}
