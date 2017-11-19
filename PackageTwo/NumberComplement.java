package PackageTwo;

public class NumberComplement {

	public static int findComplement(int num) 
    {
        int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
            System.out.println(i + " and " + j);
        }
        
        return i - num;
    }
	
	public static void main(String[] args) {
		int number = 5;
		System.out.println(findComplement(number));
	}
}
