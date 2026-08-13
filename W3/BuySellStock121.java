public class BuySellStock121
{
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int ans=solve(arr);
        System.out.println(ans);
        
    }

    public static int solve(int[] arr)
    {

        int buy_price=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++)
        {
            if(buy_price>arr[i])
            {
                buy_price=arr[i];
            }

            else{
                int current_profit=arr[i]-buy_price;
                profit=Math.max(current_profit, profit);
            }
        }

        return profit;
    }
}