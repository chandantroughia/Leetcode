/**
 *
 * @author chandantroughia
 * @date 07/06/2017
 * 
 */
import java.util.Scanner;

public class PalindromeNumber_09 {
	
	public static boolean isPalindrome(int num){
		if(num < 0 || (num != 0 && num % 10 == 0 )) return false;
		
		int rev = 0;
		int orig = num;
		
		while(orig > 0){
			rev = rev * 10 + orig % 10;
			orig = orig / 10;
		}
		return (num == rev);// || num == rev/10);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(isPalindrome(num));
	}
}
