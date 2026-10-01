class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {

            int val=nums[i];
            int freq=mp.getOrDefault(val,0);
            mp.put(val,++freq);
        }

        LinkedHashMap<Integer,Integer> lm=new LinkedHashMap<>();
        mp.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(x->lm.put(x.getKey(),x.getValue()));

        List<Integer> lans=new ArrayList<Integer>();

int n=2;

            for(Map.Entry<Integer,Integer> ms:lm.entrySet())
            {
                if(k!=0)
                {
                    lans.add(ms.getKey());
                    k--;
                }

            }


int[] ans=new int[lans.size()];
for(int i=0;i<lans.size();i++)
{
    ans[i]=lans.get(i);
}
 
        return ans;

    }
}