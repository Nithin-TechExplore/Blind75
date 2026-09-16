// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class longestSubString3 {
    public static void main(String[] args) {
        String s="pwwkewxpw";
        System.out.println(solve(s));
    }

    public static int solve(String s)
    {
        Set<Character> st=new HashSet<Character>();

        int left=0;
        int maxLength=0;

        for(int right=0;right<s.length();right++)
            {

                while(st.contains(s.charAt(right)))
                    {
                        st.remove(s.charAt(left));
                        left++;
                    }

                        st.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);

                
            }

        return maxLength;


        
        
    }
}