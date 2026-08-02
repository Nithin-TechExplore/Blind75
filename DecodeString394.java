import java.util.*;
public class DecodeString394
{
    public static void main(String[] args)
    {
        String input="3[a]2[bc]";
        String ans=solve(input);
        System.out.println(ans);
    }

    public static String solve(String input)
    {
        Stack<Character> stack=new Stack<>();
        for(char c:input.toCharArray())
        {
            if(c!=']')
            {
                stack.push(c);
            }
            else{
                StringBuilder sb=new StringBuilder();
                while(!stack.isEmpty() && Character.isLetter(stack.peek()))
                {
                    sb.insert(0, stack.pop());
                }
                String tempString=sb.toString();
                stack.pop();

                StringBuilder digit=new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) 
                {
                    digit.insert(0, stack.pop());
                    
                }
                int count=Integer.valueOf(String.valueOf(digit.toString()));

                while(count>0)
                {
                    for(char cm:tempString.toCharArray())
                    {
                        stack.push(cm);
                    }
                    count--;
                }
            }
        }
        
        StringBuilder sm=new StringBuilder();
        while (!stack.isEmpty()) {
            sm.insert(0,stack.pop());
        }
        return sm.toString();

    }
}