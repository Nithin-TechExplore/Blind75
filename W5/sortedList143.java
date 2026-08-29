class ListNode1
{
    int data;
    ListNode1 next;
    ListNode1(int val)
    {
        this.data=val;
        this.next=null;

    }
}
public class sortedList143
{

    public static void traverse(ListNode1 head)
    {
        while (head!=null) {
            System.out.print(head.data+"->");
            head=head.next;
            
        }
        System.out.println("null");

    }

    public static void reorderList(ListNode1 head)
    {

        if(head==null || head.next==null)
        {
            return;
        }

        ListNode1 p1=head;
        ListNode1 p2=head;

        while(p2.next!=null && p2.next.next!=null)
        {
            p1=p1.next;
            p2=p2.next.next;
        }

        ListNode1 preMiddle=p1;
        ListNode1 preCurrent=p1.next;

        while(preCurrent.next!=null)
        {
            ListNode1 current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }

        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle)
        {
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }

        traverse(head);

        // Before: 🟦4 → 8 → 🟪15 → 🟨23 → 16 → NULL

// Move	Code	What happens	Result1️⃣	preMiddle.next = p2.next	15 detaches 23, grabs 16	15 → 16 → NULL (🟨23 floats)
// 2️⃣	p2.next = p1.next	23 points to 4's next (8)	🟨23 → 8
// 3️⃣	p1.next = p2	insert 23 after 4	🟦4 → 🟨23 → 8 → 🟪15 → 16
// 4️⃣	p1 = p2.next	p1 moves to 8	🟦p1 = 8
// 5️⃣	p2 = preMiddle.next	p2 = 16	🟨p2 = 16
    }
    public static void main(String[] args)
    {

        ListNode1 l1=new ListNode1(4);
        ListNode1 l2=new ListNode1(8);
        ListNode1 l3=new ListNode1(15);
        ListNode1 l4=new ListNode1(16);
        ListNode1 l5=new ListNode1(23);

        ListNode1 head=l1;
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=null;

        traverse(head);

        reorderList(head);




    }


}