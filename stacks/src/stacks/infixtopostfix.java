package stacks;

import java.util.Stack;

public class infixtopostfix {
	static int pre(char c){
        switch (c){
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
static String conversion(String hm){

        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <hm.length() ; i++) {
            char c = hm.charAt(i);
            if(pre(c)>0){
                while(stack.isEmpty()==false && pre(stack.peek())>=pre(c)){
                    result += stack.pop();
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    result += x;
                    x = stack.pop();
                }
            }else if(c=='('){
                stack.push(c);
            }else{
                result += c;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            result += stack.pop();
        }
        return result;
    }

	public static void main(String[] args) {
		  String ques = "A+B*(C^D-E)+(F%G)";
	        System.out.println("Infix " + ques);
	        System.out.println("Postfix " + conversion(ques));
	    }
	

}
