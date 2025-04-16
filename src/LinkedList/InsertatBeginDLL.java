package LinkedList;

import java.util.*;



class  Node
{
    Integer data;
    Node previous;
    Node next;
    Node(Integer d)
    {
        data = d;
        next=previous=null;
    }

}



public class InsertatBeginDLL
{
    public static void main(String[] args)
    {
        Node head = new Node(null);
//        Node temp1 = new Node(20);
//        Node temp2 = new Node(30);
//        head.next = temp1;
//        temp1.previous = head;
//        temp1.next = temp2;
//        temp2.previous = temp1;
        head=insertAtBegin(head,5);
        printList(head);

    }

    static Node insertAtBegin(Node head, Integer data)
    {
        Node temp = new Node(data);
        temp.next = head;
        if (head!=null)
            head.previous=temp;
        return temp;
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
