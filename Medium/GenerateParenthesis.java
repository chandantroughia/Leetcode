package Medium;
import java.util.*;

public class GenerateParenthesis {

static ArrayList<String> per = new ArrayList<String>();
    
    private static boolean isValid(String str){
		Stack<Character> theStack = new Stack<Character>();
        for(char c: str.toCharArray()){
            if(c == '('){
                theStack.push(')');
            }
            else if(c == '{'){
                theStack.push('}');
            }
            else if(c == '['){
                theStack.push(']');
            }
            else if(theStack.isEmpty() || c != theStack.pop()){
                return false;
            }
        }
        return theStack.isEmpty();
    }
    
    
    private static void Permutations(String str, int l, int r){
        if (l == r)
            per.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                Permutations(str, l+1, r);
                str = swap(str,l,i);
            }
        }
        
    }
    
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    
    
    public static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<String>();
        HashSet<String> set = new HashSet<String>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n; i++){
            sb.append("()");
        }
        per.clear();
        Permutations(sb.toString(), 0, sb.toString().length() - 1);
        
        for(String s: per){
        	if(isValid(s)){
                set.add(s);
             }
        }
        
        return new ArrayList<String>(set);
    }
    
    public static void main(String[] args) {
    	System.out.println(generateParenthesis(3));
	}
	
}
