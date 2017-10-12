/**
 *
 * @author chandantroughia
 * @date 07/07/2017
 * 
 */
package Medium;

public class ComplexNumberMultiplication_537 {
	
	public static String complexNumberMultiply(String a, String b){
		String[] x = a.split("\\+|i");
		String[] y = b.split("\\+|i");
		
		int a_real = Integer.parseInt(x[0]);
		int a_img = Integer.parseInt(x[1]);
		int b_real = Integer.parseInt(y[0]);
		int b_img = Integer.parseInt(y[1]);
		
		return (a_real * b_real - a_img * b_img) + "+" + (a_real * b_img + a_img * b_real) + "i";
	}

	public static void main(String[] args) {
		String a = "1+1i";
		String b = "1+1i";
		
		String c = "1+-1i";
		String d = "1+-1i";
		
		System.out.println(complexNumberMultiply(a, b));
		System.out.println(complexNumberMultiply(c, d));
	}
}
