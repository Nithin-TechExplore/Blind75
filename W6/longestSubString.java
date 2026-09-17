// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {

        String s="pwwkewxpw";
        System.out.println(solve(s));
    }

    public static String longestSubString(String s)
    {
        Set<Character> set=new LinkedHashSet<>();
        int left=0;
        int maxLength=0;
        String ans="";

        for(int right=0;right<s.length();right++)
            {
                while(set.contains(s.charAt(right)))
                    {
                        set.remove(s.charAt(left));
                        left++;
                    }
                    
                set.add(s.charAt(right));
                if(set.size()>maxLength)
                {
                    maxLength=set.size();
                    ans="";

                    for(char ch:set)
                        {
                            ans+=ch;
                        }
                    
                }
            }

        return ans;
        
        
    }
}