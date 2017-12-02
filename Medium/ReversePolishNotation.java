package Medium;

import java.util.ArrayList;
import java.util.Stack;

public class ReversePolishNotation {
	
	public static int evalRPN(String[] tokens) {
        Stack<Integer> theStack = new Stack<Integer>();
        
        for(String str: tokens){
        	switch(str){
        	case "+":
        		int a = theStack.pop();
        		int b = theStack.pop();
        		theStack.push(b + a);
        		break;
        	
        	case "*":
        		a = theStack.pop();
        		b = theStack.pop();
        		theStack.push(b * a);
        		break;
        		
        	case "-":
        		a = theStack.pop();
        		b = theStack.pop();
        		theStack.push(b - a);
        		break;
        		
        	case "/":
        		a = theStack.pop();
        		b = theStack.pop();
        		theStack.push(b / a);
        		break;
        	
        	default:
        		theStack.push(Integer.valueOf(str));
        		
        	}
        }
        return theStack.pop();
    }
	
	
	public static void main(String[] args) {
		String[] tokens =  {"0","3","/"};
		
		System.out.println(evalRPN(tokens));
		
		String str = "dsafafa2334";
		
		char[] ch = str.toCharArray();
		
		for(char i: ch){
			System.out.print(i + " ");
		}
	}
}
