import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
	
	public static ArrayList<String> fizzBuzz(int n){
		ArrayList<String> ret = new ArrayList<String>(n);
		
		for(int i = 1, fizz = 0, buzz = 0; i <= n; i++)
		{
			fizz++;
			buzz++;
			
			if(fizz == 3 && buzz == 5){
				ret.add("FizzBuzz");
				fizz = 0;
				buzz = 0;
			}
			
			else if(fizz == 3){
				ret.add("Fizz");
				fizz = 0;
			}
			
			else if(buzz == 5){
				ret.add("Buzz");
				buzz = 0;
			}
			else{
				ret.add(String.valueOf(i));
			}
			
		}
		
		return ret;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<String> ans = new ArrayList<String>(n);
		
		ans = fizzBuzz(n);
		
		System.out.println(ans);
	}
}
