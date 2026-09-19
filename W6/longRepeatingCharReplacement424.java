// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class longRepeatingCharReplacement424 {
    public static void main(String[] args) {
        String s="AABABCC";
        int k=2;
        System.out.println(characterReplacement(s,k));
    }

    public static int characterReplacement(String s,int k)
    {
        int[] freq=new int[26];
        int left=0;
        int maxFreq=0;
        int maxWindow=0;

        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);
            int windowsLength=right-left+1;
            if(windowsLength-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowsLength=right-left+1;
            maxWindow=Math.max(maxWindow,windowsLength);
        }
        return maxWindow;
    }
}


