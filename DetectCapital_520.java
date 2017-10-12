/**
 *
 * @author chandantroughia
 * @date 07/02/2017
 * 
 */

import java.util.Scanner;

public class DetectCapital_520 {

	public static boolean detectCapitalUse(String word){
		if(word.length() < 2) return true;
		if(word.toUpperCase().equals(word)) return true;
		if(word.substring(1).toLowerCase().equals(word.substring(1))) return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		
		System.out.println(detectCapitalUse(word));
	}
}
