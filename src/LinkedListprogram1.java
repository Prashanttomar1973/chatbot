
public class LinkedListprogram1 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public void display(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"\n");
            n=n.next;
        }
    }

    public static void main(String[] args){
    LinkedListprogram1 list=new LinkedListprogram1();

    list.head =new Node(100);
    Node second=new Node(200);
    Node third=new Node(300);

    
    list.head.next=second;
    second.next=third;
    list.display();

    }
    }

