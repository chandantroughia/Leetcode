package hard;

import java.util.Stack;

public class BasicCalci {
	
	
	    
	    private static boolean isOpeningParanthesis(char ch){
			if(ch == '(') return true;
			return false;
		}
		
		private static boolean isClosingParanthesis(char ch){
			if(ch == ')') return true;
			return false;
		}
		
		private static int precD(char ch){
			switch (ch)
	        {
	        case '+':
	        case '-':
	            return 1;
	      
	        case '*':
	        case '/':
	            return 2;
	      
	        case '^':
	            return 3;
	        }
	        return -1;
		}
		
		private static boolean isOperator(char ch){
			if(ch == '+' || ch == '^' || ch == '-' || ch == '/' || ch == '*'){
				return true;
			}
			
			return false;
		}
		
		
		private static String infixToPostfix(String exp){
			String result = new String("");
			Stack<Character> theStack = new Stack<Character>();
			
			for(int i = 0; i < exp.length(); i++){
				char ch = exp.charAt(i);
				
				if(Character.isDigit(ch)){
					result += ch;
				}
				
				else if(isOperator(ch)){
					while(!theStack.isEmpty() && !isOpeningParanthesis(theStack.peek()) && precD(theStack.peek()) >= precD(ch)){
						result += theStack.pop();
					}
					theStack.push(ch);
				}
				
				else if(isOpeningParanthesis(ch)){
					theStack.push(ch);
				}
				
				else if(isClosingParanthesis(ch)){
					while(!theStack.isEmpty() && !isOpeningParanthesis(theStack.peek())){
						result += theStack.pop();
					}
					theStack.pop();
				}
			}
			
			while(!theStack.isEmpty()){
				result += theStack.pop();
			}
			System.out.println(result);
			return result;
		}
	    
	    public static int evalRPN(String tkns) {
	        Stack<Integer> theStack2 = new Stack<Integer>();
	        
	        char[] array = tkns.toCharArray();
	        
	        for(char str: array){
	        	switch(str){
	        	case '+':
	        		int a = theStack2.pop();
	        		int b = theStack2.pop();
	        		theStack2.push(b + a);
	        		break;
	        	
	        	case '*':
	        		a = theStack2.pop();
	        		b = theStack2.pop();
	        		theStack2.push(b * a);
	        		break;
	        		
	        	case '-':
	        		a = theStack2.pop();
	        		b = theStack2.pop();
	        		theStack2.push(b - a);
	        		break;
	        		
	        	case '/':
	        		a = theStack2.pop();
	        		b = theStack2.pop();
	        		theStack2.push(b / a);
	        		break;
	        	
	        	default:
	        		theStack2.push(Character.getNumericValue(str));
	        		
	        	}
	        }
	        
	        return theStack2.pop();
	    }
	    
	    
	    
	    public static int calculate(String s) {
	        
	        String myPostfix = infixToPostfix(s);
	        //System.out.println(myPostfix);
	        
	        return evalRPN(myPostfix);
	        
	    }
	
	    public static void main(String[] args) {
			String str = "(1+(4+5+2)-3)+(6+8)";
			
			System.out.println(calculate(str));
			System.out.println(calculate("0*1"));
		}

}
