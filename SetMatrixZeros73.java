import java.util.*;
public class SetMatrixZeros73
{
    public static void main(String[] args)
    {
        int[][] arr={{1,2,3},{4,6,0},{5,7,9}};
        solve(arr);

    }

    public static void solve(int[][] arr)
    {
        boolean firstRow=false,firstColumn=false;
        for(int i=0;i<arr[0].length;i++)
        {
            if(arr[0][i]==0)
                {
                   firstRow=true;
                }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]==0)
                {
                   firstColumn=true;
                }
        }
        
        

        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[0][j]=0;
                    arr[i][0]=0;
                }
            }
        }

        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(arr[i][0] ==0 || arr[0][j] ==0)
                {
                    arr[i][j]=0;
                }
            }
        }

        if(firstRow)
        {
            for(int i=0;i<arr[0].length;i++)
            {
                arr[0][i]=0;
            }
        }

        if(firstColumn)
        {
            for(int i=0;i<arr.length;i++)
            {
                arr[i][0]=0;
            }
        }

        for(int[] a1:arr)
        {
        System.out.println(Arrays.toString(a1));
        }

    }
}