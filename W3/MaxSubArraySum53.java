public class MaxSubArraySum53 {
    
    public static void main(String[] args)
    {
        int[] arr={-2,-5,6,-2,-3,1,5,-6};
        int sum=solve(arr);
        System.out.println(sum);
    }

    public static int solve(int[] arr)
    {
        int max_so_far=arr[0];
        int curr_max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            curr_max=Math.max(arr[i], arr[i]+curr_max);
            max_so_far=Math.max(curr_max,max_so_far);

        }

        return max_so_far;

    }
}
