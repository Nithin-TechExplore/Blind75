import java.util.*;
public class ValidParentheses20
{

    public static void main(String[] args)
    {
        String s = "()[]{";
        boolean ans=solve(s);
        System.out.println(ans);


    }

    public static boolean solve(String s)
    {

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                stack.push(')');
            }
            else if(c == '[')
            {
                stack.push(']');
            }
            else if(c=='{')
            {
                stack.push('}');
            }

            else if(stack.isEmpty() || stack.pop()!=c)
            {
                return false;
            }

        }

        return stack.isEmpty();



    }
}