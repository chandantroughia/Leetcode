package string_arrays;
/**
 *
 * @author chandantroughia
 * 
 */

public class ReverseWordsInAString {
	
	public static String firstFunction(String input){
		String[] words = input.split(" ");
		
		StringBuilder ans = new StringBuilder();
		for(String word: words){
			ans.append(new StringBuffer(word).reverse().toString() + " ");
		}
		
		return ans.toString().trim();
	}
	
	public static String secFunction(String input){
		StringBuilder ans = new StringBuilder();
		StringBuilder word = new StringBuilder();
		
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) != ' '){
				word.append(input.charAt(i));
			}else{
				ans.append(word.reverse());
				ans.append(" ");
				word.setLength(0);
			}
		}
		
		ans.append(word.reverse());
		return ans.toString().trim();
		
	}
	
	
	public static void main(String[] args) {
		String input = "Let's take LeetCode contest";
		
		System.out.println(firstFunction(input));
		System.out.println(secFunction(input));
	}
}
