// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr={2,1,3,4};
        int[] ans=solve(arr);
        System.out.println(Arrays.toString(ans));
        
    }

    public static int[] solve(int[] arr)
    {
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        left[0]=1;
        for(int i=1;i<arr.length;i++)
            {
                left[i]=left[i-1]*arr[i-1];
            }

        right[arr.length-1]=1;
        for(int i=arr.length-2;i>-1;i--)
            {
                right[i]=right[i+1]*arr[i+1];
            }

        int[] ans=new int[arr.length];

        for(int i=0;i<arr.length;i++)
            {
                ans[i]=left[i]*right[i];
            }
        return ans;
        
    }
}