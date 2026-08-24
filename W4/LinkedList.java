package W4;
class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedList
{
    public static <T> void traverse(Node<T> head)
    {
        Node<T> current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static <T> Node<T> insert(Node<T> head,T data, int position)
    {
        Node<T> newNode=new Node<>(data);
        if(position==0)
        {
            newNode.next=head;
            return newNode;
        }

        Node<T> prev=head;
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

    public static <T> Node<T> delete(Node<T> head, int position)
    {
        if(head==null)
        {
            return null;
        }

        if(position==0)
        {
            return head.next;
        }
        
        Node<T> prev=head;
        for(int i=0;i<position-1;i++)
        {
            if(prev==null || prev.next ==null)
            {
                System.out.println("We are sorry you cannpt delete this!!");
            }
            prev=prev.next;
        }

        if(prev.next!=null)
        {
            prev.next=prev.next.next;
        }

        return head;

    }

    public static Node reverseRecursive(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public static Node reverseIterative(Node head)
    {
        Node prev=null;
        Node current=head;
        while(current!=null)
        {
            Node nextTemp=current.next;
            current.next=prev;
            prev=current;
            current=nextTemp;
        }
        return prev;
    }
    public static void main(String[] args)
    {
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);

        Node<Integer> head=n1;
        n1.next=n2;
        n2.next=n3;

        System.out.println("Initial Linked List");
        traverse(head);

        head=insert(head, 90, 2);

        System.out.println("Inserted Data in Linked List");
        traverse(head);

        head=insert(head, 44, 4);
        traverse(head);

        head=insert(head, 55, 0);
        traverse(head);

        head=insert(head, 55, 9);
        traverse(head);              

        head=delete(head,2);
        traverse(head);
                head=delete(head,0);
        traverse(head);
                head=delete(head,3);
        traverse(head);

        Node revNode=reverseIterative(head);
        traverse(revNode);

        Node recRevNode=reverseRecursive(revNode);
        traverse(recRevNode);
    }
    
}