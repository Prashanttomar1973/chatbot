public class LinkedListprogram2{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);

        if(head== null){
            head=newNode;
            tail=newNode;
        }

        else{

            tail.next=newNode;
            tail=newNode;
        }
    }

    public void display(){
        Node current=head;

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedListprogram2 b=new LinkedListprogram2();
        b.addNode(1);
        b.addNode(2);
        b.addNode(3);
        b.addNode(4);
        b.display();
    }

}