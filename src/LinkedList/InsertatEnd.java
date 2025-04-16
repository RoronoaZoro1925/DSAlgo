package LinkedList;


public class InsertatEnd
{

    public static void main(String[] args)
    {
        Node head = new Node(10);

    }

    static Node atEnd(Node head, int data)
    {
        Node temp = new Node(data);
        if (head == null)
            return temp;

        Node current = head;
        while (current.next!=null)
        {
            current = current.next;
        }
        current.next=null;
        current.previous=temp;
        return head;

    }

    public static void printList(Node head)
    {
        Node current = head;
        while (current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();

    }
}
