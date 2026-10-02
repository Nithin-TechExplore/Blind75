// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
    int[] coins={1,2,5};
        int amount=11;
        System.out.println(solve(coins,amount));
    
    }

    public static int solve(int[] coins,int amount)
    {
        if(amount<1) return 0;

        int[] minCoinsDP=new int[amount+1];

        for(int i=1;i<=amount;i++)
            {
                minCoinsDP[i]=Integer.MAX_VALUE;

                for(int coin:coins)
                    if(coin<=i && minCoinsDP[i-coin] != Integer.MAX_VALUE)
                  minCoinsDP[i]=Math.min(minCoinsDP[i],1+minCoinsDP[i-coin]);     


                    
            }

        if(minCoinsDP[amount] == Integer.MAX_VALUE)
            return -1;
        return minCoinsDP[amount];
        
    }
}