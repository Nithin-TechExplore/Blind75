import java.util.regex.*;
class Solution {

    public static void main(String[] args)
    {
        String s="A man, a plan, a canal: Panama";
        boolean myAns=isPalindrome(s);
        System.out.println(myAns);
    }
    public boolean isPalindrome(String s) {

        Pattern pattern=Pattern.compile("[a-zA-Z0-9]+");
        Matcher matcher=pattern.matcher(s);
        StringBuilder sb=new StringBuilder();
        while(matcher.find())
        {
            sb.append(matcher.group().toLowerCase());
        }
        String ans=sb.toString();

        int left=0;
        int right=ans.length()-1;
        while(left<right)
        {
            if(ans.charAt(left)==ans.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }

           // return true;

        }

        return true;
        
    }
}