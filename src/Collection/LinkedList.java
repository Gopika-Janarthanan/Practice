package Collection;

public class LinkedList {
    static Node head=null,tail=null;
    public static void main(String[] args) {

        addFirst(1);
        addFirst(2);
        addLast(7);
        addFirst(3);
        addLast(12);
        addFirst(0);
        addLast(120);
        countnode();
        display();
        reverse();
        indexofnode(3);
        deletefirst();



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
    static void addLast(int val){
        if(tail==null){
            addFirst(val);
        }
        else{
            Node newnode = new Node(val);
            tail.next=newnode;
            tail=newnode;
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
    static int countnode(){
        Node current = head;
        int c=0;
        while(current!=null){
            c++;
            current=current.next;
        }
        return c;
    }
    static void reverse(){
        Node pre=null,temp=head,after;
        head=tail;
        tail=temp;
        while(temp!=null){
            after=temp.next;
            temp.next=pre;
            pre=temp;
            temp=after;
        }
        display();

    }
    static void deletefirst(){
        if(head==null){
            System.out.println("Linnked list is empty");
        }
        else{
            head=head.next;
        }
        display();
    }
    static void indexofnode(int index) {
        int c = 0;
        Node current =head;
        while(current!=null){
            if(c==index){
                System.out.println(current.val);
            }
            c++;
            current=current.next;
        }
    }
    static void deletelast() {
        if (tail == null) {
            System.out.println("List is empty");
        }
        else {
            indexofnode((countnode()-1));
        }
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


