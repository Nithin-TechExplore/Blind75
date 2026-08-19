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
    }
    
}