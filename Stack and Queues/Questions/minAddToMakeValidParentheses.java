import java.util.Stack;

public class minAddToMakeValidParentheses {
    public static int makevalid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch :s.toCharArray()){
        if (ch ==')'){
            if (!stack.isEmpty() && stack.peek() =='('){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }else{
            stack.push(ch);
        }
        }
        return stack.size();
    }
    public static void main(String[] args) {
        String s ="())";
        System.out.println(makevalid(s));
    }
}

