public class JumpGame55
{
    public static void main(String[] args)
    {
        int[] arr={1,1,2,5,2,1,0,0,1,3};
        boolean ans=solve(arr);
        System.out.println(ans);
    }

    public static boolean solve(int[] arr)
    {
        int finalPosition=arr.length-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(i+arr[i]>=finalPosition)
            {
                finalPosition=i;
            }

        }

        return finalPosition==0;

    }


}