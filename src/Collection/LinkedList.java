package Collection;

public class LinkedList {
    static Node head=null,tail=null;
    public static void main(String[] args) {
        addFirst(1);
        addFirst(2);
        addFirst(3);
        display();


    }
    static void addFirst(int val){
        Node node = new Node(val);
        if(head==null)  {
            head=node;
            tail=node;
            tail.next=null;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    static void  display(){
        Node current =head;
        while(current!=null){
            System.out.print(current.val+ " -> ");
            current=current.next;
        }
        System.out.println("null");
    }
}
class Node{
    Node next;
    int val;
    Node(int val){
        this.val=val;
        this.next=null;
    }
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }


}


