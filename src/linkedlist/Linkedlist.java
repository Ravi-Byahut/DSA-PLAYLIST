package linkedlist;

public class Linkedlist {

    public static void main(String[] args) {
        Node head=null;
        Integer[] arr={1,2,3,10,5};
        Node temp=head;
        for(Integer i:arr)
        {
            if(head==null)
            {
                Node n=new Node(i,null);
                head=n;
                temp=head;
            }
            else {
                Node ns=new Node(i,null);
                temp.next=ns;
                temp=temp.next;
            }

        }
        printLinkedList(head);

    }
   static void printLinkedList(Node head)
    {
        if(head==null)
        {
            System.out.println("Empty Linked List");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

class Node{
    Integer data;
    Node next;
    Node(Integer data, Node next)
    {
        this.data=data;
        this.next=next;
    }
    Node(Integer data)
    {
        this.data=data;
    }
    Node(Node next)
    {
        this.next=next;
    }
}
