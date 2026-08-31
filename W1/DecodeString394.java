package W1;
import java.util.*;
// Input: s = "3[a]2[bc]"
// Output: "aaabcbc"
public class DecodeString394
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String which you want to take as input");
        String input=sc.next();
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
                String tempSb=sb.toString();
                stack.pop();

                StringBuilder digit=new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek()))
                {
                    digit.insert(0, stack.pop());
                }

                int count=Integer.valueOf(digit.toString());

                while(count>0)
                {
                    for(char i:tempSb.toCharArray())
                    {
                        stack.push(i);
                    }
                    count--;
                }
            }
        }


        StringBuilder output=new StringBuilder();
        while(!stack.isEmpty())
        {
            output.insert(0, stack.pop());
        }

        return output.toString();

    }
}