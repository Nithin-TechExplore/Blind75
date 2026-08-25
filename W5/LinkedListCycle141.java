package W5;

import java.util.List;

//https://www.youtube.com/watch?v=jcZtMh_jov0&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=39
public class LinkedListCycle141 {

    public static void main(String[] args) {
        MyNode mn1=new MyNode(3);
        MyNode mn2=new MyNode(2);
        MyNode mn3=new MyNode(0);
        MyNode mn4=new MyNode(-4);

        mn1.next=mn2;
        mn2.next=mn3;
        mn3.next=mn4;
        mn4.next=mn2;
        
        //Detect Linked List Cycle
        boolean n1=detectCycle(mn2);
        System.out.println(n1);

        MyNode kn1=new MyNode(1);
        boolean n2=detectCycle(kn1);
        System.out.println(n2);

        //Detect First Node of the Cycle
        MyNode p1=detectFirstNode(mn1);
        System.out.println(p1.val);





    }

    public static boolean detectCycle(MyNode head)
    {
        MyNode slow=head;
        MyNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow== fast)
            {
                return true;
            }
        }
        return false;

        
    }

        public static MyNode detectMyCycle(MyNode head)
    {
        MyNode slow=head;
        MyNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow== fast)
            {
                return slow;
            }
        }
        return null;
    }

    public static MyNode detectFirstNode(MyNode head)
    {
        MyNode meet=detectMyCycle(head);
        MyNode start=head;
        while(start!=meet)
        {
            start=start.next;
            meet=meet.next;
        }
        return start;

    }


}
