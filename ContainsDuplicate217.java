import java.util.*;

public class ContainsDuplicate217
{
    public static void main(String[] args)
    {
        List<Integer> li=Arrays.asList(1,2,3,4,3,5,6);
        boolean ans=solve(li);
        System.out.println(ans);


    }

    public static boolean solve(List<Integer> li)
    {

        HashSet<Integer> hs=new HashSet();

        for(int i=0;i<li.size();i++)
        {
            if(hs.contains(li.get(i)))
                return true;

            hs.add(li.get(i));
        }

        return false;
    }
}