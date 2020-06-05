package stacks;

import java.util.Stack;

public class balanceparenthesis {
	  public static boolean balParenthesis(String exp)
	    {
	        Stack stack = new Stack();

	        for (int i = 0; i < exp.length(); i++)
	        {
	       if (exp.charAt(i) == '(' || exp.charAt(i) == '{' ||	   exp.charAt(i) == '[') {
	          stack.push(exp.charAt(i));
	        if (exp.charAt(i) == ')' || exp.charAt(i) == '}' ||  exp.charAt(i) == ']')
	            {
	                if (stack.isEmpty()) {
	      return false;
	                }
	                }
	       Character top = (Character) stack.pop();
   if ((top == '(' && exp.charAt(i) != ')') ||
	                  (top == '{' && exp.charAt(i) != '}') ||
	                    (top == '[' && exp.charAt(i) != ']')) {

	                    return false;
	                }
	            }
	   }
         return stack.empty();
     }
	public static void main(String[] args) {
	      String exp = "{()}[{}]";
   if (balParenthesis(exp)) {
              System.out.println("The expression is balanced");
          } else {
              System.out.println("The expression is not balanced");
          }
	}
}