package LinkedList;

import org.w3c.dom.Node;

import java.util.Collections;
import java.util.LinkedList;

public class NewNode
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList(Collections.singleton(4.0));
        System.out.println(l.getFirst());;
        System.out.println(l.getLast());;
        System.out.println(l.size());;
        System.out.println(l);

    }

}

