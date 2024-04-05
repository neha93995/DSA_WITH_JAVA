import java.util.Stack;

public class ValidParenthesis {

    // only for () small brackets
    static boolean validParenthesis(String s)
    {
        int open =0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;
            }
            else if(s.charAt(i)==')')
            {
                open--;
            }
            if(open<0)
            {
                return false;
            }
        }
        if(open==0)
        {
            return true;
        }
        return false;
    }


    //Function to check if brackets are balanced or not for (){}[]
    static boolean ispar(String x)
    {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<x.length(); i++)
        {
            char ch = x.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                stack.push(ch);
            }
            else{
                char peek = stack.peek();
                System.out.println(peek+"  "+ch);
    
                if(x.charAt(i) == ')' && peek == '(')
                {
                    stack.pop();
                }
                else if(x.charAt(i) == '}' && peek == '{')
                {
                    stack.pop();
                }
                else if(x.charAt(i)==']' && peek == '[')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(validParenthesis("(())()()(())"));
        System.out.println(ispar("({{[]}})"));
        
    }
}
