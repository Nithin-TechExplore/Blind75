// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class HouseRobber2_213 {
    public static void main(String[] args) {
        int[] nums={2,7,3,1,4,2,1,8};
        System.out.println(rob(nums));
    
    }

    public static int rob(int[] nums)
    {

        if(nums.length<2)
            return nums[0];

        int[] skipLastHouse=new int[nums.length-1];
        int[] skipFirstHouse=new int[nums.length-1];

        for(int i=0;i<nums.length-1;i++)
        {
            skipLastHouse[i]=nums[i];
            skipFirstHouse[i]=nums[i+1];
        }

        int lootSkippingFirst=robHelper(skipLastHouse);
        int lootSkippingLast=robHelper(skipFirstHouse);

        return Math.max(lootSkippingFirst,lootSkippingLast);
    }

    private static int robHelper(int[] nums)
    {
        if(nums.length<2)
        {
            return nums[0];
        }

        int[] dp=new int[nums.length];

        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++)
            {
                dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
            }
        return dp[nums.length-1];
    }
}