package W1;
public class JumpGame2_45
{
    public static void main(String[] args)
    {

        int[] nums={2,4,1,2,3,1,1,2};
        int totalJumps = solve(nums);
        System.out.println(totalJumps);
    }

    public static int solve(int[] nums)
    {
        int totalJumps=0;
        int destination=nums.length-1;
        int coverage=0,lastJumpIdx=0;

        if(nums.length == 1) return 0;

        for(int i=0;i<nums.length;i++)
        {
            coverage=Math.max(coverage,i+nums[i]);
            if(i==lastJumpIdx)
            {
                lastJumpIdx=coverage;
                totalJumps++;

                if(coverage>=destination)
                    return totalJumps;
            }
        }

        return totalJumps;

    }

}