import java.util.*;

class topKFreEle347 {
    public static void main(String[] args) {
        int[] nums={4,1,-1,2,-1,2,3};
        int k=2;
int[] ans=topKFrequent(nums,k);
        System.out.println(Arrays.toString(ans));
    }

     public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int count=mp.getOrDefault(num,0);
            mp.put(num,++count);
        }

        Map<Integer,Integer> fMap=new LinkedHashMap<>();

        mp.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(x->fMap.put(x.getKey(),x.getValue()));

        List<Integer> li=new ArrayList<>();
        int cnt=1;

        for(Map.Entry<Integer,Integer> ms:fMap.entrySet())
        {
            if(cnt<=k)
            {
                int res=ms.getKey();
                li.add(res);
            }
            else
            {
                break;
            }
            cnt++;
        }

        int[] ap=new int[li.size()];

        for(int i=0;i<ap.length;i++)
        {
            ap[i]=li.get(i);
        }

        return ap;
        
    }
}