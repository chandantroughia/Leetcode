/**
 *
 * @author chandantroughia
 * @date 07/07/2017
 * 
 */
package PackageTwo;

import java.util.Scanner;

public class LengthOfTheLastWord_58 {
	
	public static int theLastWordLength(String str){
		int i, k = 0;
		str = str.trim();
		
		for(i = str.length() - 1; str.charAt(i) != ' '; i--){
			k++;
		}
		
		return k;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(theLastWordLength(str));
	}
}
