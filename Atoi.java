import java.util.Scanner;

public class Atoi {
	public static int myAtoi(String str){
		if(str == null || str.isEmpty()) return 0;
		str = str.trim();
		int i = 0;
		char flag = '+';
		if(str.charAt(0) == '-'){
			flag = '-';
			i++;
		}
		
		if(str.charAt(0) == '+'){
			i++;
		}
		
		double result = 0;
		while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <='9'){
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}
		
		if(flag == '-'){
			result = -result; 
		}
		
		return (int) result;
			
	}
	
	public static int two(String str){
		return Integer.valueOf(str);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(myAtoi(str));
		System.out.println(two(str));
	
	}
	
}
