import java.util.Stack;

public class validParentheses {
    public boolean checkParentheses(String str)
    {
        if(str.length()%2 !=0)
        {
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(char c:str.toCharArray())
        {
            if(c ==')' && !stack.isEmpty() && stack.peek() =='(')
            {
                stack.pop();
            }
            else if(c =='}' && !stack.isEmpty() && stack.peek() =='{')
            {
                stack.pop();
            }
            else if(c ==']' && !stack.isEmpty() && stack.peek() =='[')
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args)
    {
        String str="{[()}";
        validParentheses obj=new validParentheses();
        Boolean result=obj.checkParentheses(str);
        System.out.println(result);
    }
}
