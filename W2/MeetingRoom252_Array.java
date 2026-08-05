import java.util.*;
public class MeetingRoom252_Array
{
    public static void main(String[] args)
    {
     //   int[][] arr={{5,10},{0,30},{15,20}};
        int[][] arr={{5,8},{9,15}};

        System.out.println(solve(arr));


    }

    public static boolean solve(int[][] arr)
    {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));

        for(int i=0;i<arr.length;i++)
        {
        System.out.println(Arrays.toString(arr[i]));

        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i][1]>arr[i+1][0])
            {
                return false;
            }

        }

        return true;

    }
}