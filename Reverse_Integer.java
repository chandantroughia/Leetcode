import java.util.Scanner;

public class Reverse_Integer {
	
	public static int reverse(int x) {
        long rev = 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
        
    }
	
//	public static int reverse(int num){
//		boolean flag = false;
//		
//		if(num < 0){
//			flag = true;
//			num = -1 * num;
//		}
//		
//		int rev = 0;
//		while(num != 0){
//			rev = rev * 10 + num%10;
//			num = num/10;
//		}
//		
//		if(flag == true){
//			
//			return -1 * rev;
//		}
//		
//		return rev;
//	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = -321;//in.nextInt();
		int result = reverse(number);
		
		System.out.println(result);
		
	}
}
