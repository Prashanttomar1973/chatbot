public class LinkedListprogram_3 {

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

        if(head == null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public int countNodes(){
        int count=0;
        Node current=head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }


    public void display(){
        Node current=head;
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list:");
        while(current != null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();

    }



    public static void main(String[] args){
        LinkedListprogram_3 ob=new LinkedListprogram_3();
        ob.addNode(1);
        ob.addNode(2);
        ob.addNode(3);
        ob.addNode(4);
        ob.display();
        System.out.println("Count of nodes present in the list:"+ob.countNodes());

    }
}
