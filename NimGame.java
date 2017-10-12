/**
 *
 * @author chandantroughia
 * @date 07/02/2017
 * 
 */

import java.util.Scanner;

public class NimGame {

	public static boolean nimGame(int num){
		return (num % 4 != 0);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(nimGame(num));
	}
}
