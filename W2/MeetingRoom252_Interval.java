import java.util.*;

public class MeetingRoom252_Interval {

    public static void main(String[] args) {
        // Intervals int1=new Intervals(5, 8);
        // Intervals int2=new Intervals(9, 15);

        Intervals int1=new Intervals(0, 30);
        Intervals int2=new Intervals(5, 10);
        Intervals int3=new Intervals(15, 20);

        List<Intervals> li=new ArrayList<>();
        li.add(int1);
        li.add(int2);
        li.add(int3);
        System.out.println(solve(li));
    }

    public static boolean solve(List<Intervals> interval)
    {
        Collections.sort(interval,(a,b)->Integer.compare(a.start, b.start));
        
        for(int i=1;i<interval.size();i++)
        {
            Intervals current=interval.get(i);
            Intervals previous=interval.get(i-1);

            if(current.start<previous.end)
            {
                return false;
            }
        }

        return true;
    }
    
}
