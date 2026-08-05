import java.util.*;

public class TwoSum2
{
    public static void main(String[] args) {

        int[] arr={2,7,11,15};
        int target=9;
        int[] ans = solve(arr,target);
        System.out.println(Arrays.toString(ans));
        
    }

    public static int[] solve(int[] arr,int target)
    {

        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            int ele=target-arr[i];

            if(mp.containsKey(ele))
            {
                return new int[]{mp.get(ele),i};
            }


            mp.put(arr[i],i);

        }
        return new int[]{};

    }
    
}