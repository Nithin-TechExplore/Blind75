// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class HouseRobber198 {
    public static void main(String[] args) {
        int[] arr={2,7,3,1,4,2,1,8};
        System.out.println(solve(arr));
    }

    public static int solve(int[] nums)
    {
        if(nums.length<2)
            return nums[0];

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