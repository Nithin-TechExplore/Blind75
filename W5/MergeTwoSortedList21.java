package W5;

public class MergeTwoSortedList21 {

    public static <T> void traverse(ListNode<T> head)
    {
        ListNode<T> current=head;
        while (current!=null) {
            System.out.print(current.val+"->");
            current=current.next;
            
        }
        System.out.println("null");
    }

    public static <T> ListNode insert(ListNode<T> head, T val,int position)
    {
        ListNode<T> newNode=new ListNode<>(val);
        if(position==0)
        {
            newNode.next=head;
            return newNode;
        }
        ListNode<T> prev=head;
        for(int i=0;i<position-1;i++)
        {
            if(prev==null)
            {
                System.out.println("Cannot add the data here");
                return head;
            }
            prev=prev.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;
        return head;
    }

    public static void main(String[] args)
    {
        ListNode<Integer> l1=new ListNode<>(10);
        ListNode<Integer> l2=new ListNode<>(20);
        ListNode<Integer> l3=new ListNode<>(30);

                ListNode<Integer> m1=new ListNode<>(1);
        ListNode<Integer> m2=new ListNode<>(2);
        ListNode<Integer> m3=new ListNode<>(3);

        ListNode<Integer> lN1=l1;
        l1.next=l2;
        l2.next=l3;

        ListNode<Integer> lN2=m1;
        m1.next=m2;
        m2.next=m3;

        System.out.println("My First Linked List");
        traverse(lN1);
        traverse(lN2);

       ListNode<Integer> ml= mergeList(lN1,lN2);
             traverse(ml);


    }

    public static <T extends Comparable<T>> ListNode<T> mergeList(ListNode<T> l1,ListNode<T> l2)
    {
        ListNode<T> revListNode=new ListNode<T>(null);
        ListNode<T> heaNode=revListNode;

        while (l1!=null && l2!=null) {
            if(l1.val.compareTo(l2.val)<=0)
            {
                revListNode.next=l1;
                l1=l1.next;
            }
            else{
                revListNode.next=l2;
                l2=l2.next;
            }
            revListNode=revListNode.next;
     }

     if(l1==null)
     {
        revListNode.next=l2;
     }
     else if(l2==null)
     {
        revListNode.next=l1;
     }


     return heaNode.next;

    }
    
}
