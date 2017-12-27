/**
 *
 * @author chandantroughia
 * @date 07/06/2017
 * 
 */
package PackageTwo;

public class CountSegment_434 {
	
	public static int countSegment(String s){
		if( s.length() == 0) return 0;
		else return s.split("\\s+").length;
	}
	
	public static void secondFunction(String s){
		s = s.replaceFirst("[^A-Za-z0-9]", "");
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i)==' ') count++;
		}
		System.out.println(count+1);
	}
	
	
	public static void main(String[] args) {
		String s = "Hello, my name is John";
		System.out.println(countSegment(s));
		secondFunction(s);
		
	}

}
