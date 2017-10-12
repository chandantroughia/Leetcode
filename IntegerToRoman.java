/**
 *
 * @author chandantroughia
 * @date 06/27/2017
 * 
 */

import java.util.Scanner;

public class IntegerToRoman {
	
	private static final String[] numerals = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	private static final int[] values = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	
	public static String integerToRoman(int value){
		if(value > 3999 && value < 1) throw new IllegalArgumentException();
		
		StringBuilder numeral = new StringBuilder();
		int i = 0;
		
		while(value > 0){
			if(value - values[i] >= 0){
				numeral.append(numerals[i]);
				value -= values[i];
			}
			else{
				i++;
			}
		}
		
		return numeral.toString();
	}
	
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = in.nextInt();
		System.out.println("The Roman of " + number + " is : " + integerToRoman(number));
	}

}
