package string_arrays;

public class LongestPalindromicSubstringDP {
	
	private static void printSubString(String str, int start, int end){
		System.out.println(str.substring(start, end));
	}

	private static int longestSubstring(String str){
		int len = str.length();
		boolean[][] table = new boolean[len][len];
		
		//for strings of length 1.
		int maxLen = 1;
		for(int i = 0; i < len; i++){
			table[i][i] = true;
		}
		
		//for strings of length 2.
		int start = 0;
		for(int i = 0; i < len - 1; i++){
			if(str.charAt(i) == str.charAt(i + 1)){
				table[i][i + 1] = true;
				start = i;
				maxLen = 2;
			}
		}
		
		//for string of length 3 and more
		for(int k  = 3; k  <= len; k++){
			//set the starting point
			for(int i = 0; i < len - k + 1; i++){
				//get the end of the string
				int j = i + k - 1;
				if(table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)){
					table[i][j] = true;
					
					if(k > maxLen){
						start = i;
						maxLen = k;
					}
				}
			}
		}
		printSubString(str, start, start + maxLen);
		return maxLen;
	}
	
	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
		int length  = longestSubstring(str);
		System.out.println(length);
	}
}
