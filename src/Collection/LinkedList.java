package Collection;

public class LinkedList {
    static Node head = null, tail = null;

    public static void main(String[] args) {
        addFirst(3);
        addFirst(100);
        addFirst(4);
        addLast(7);
        addFirst(2);
        addLast(122);
        addFirst(0);
        addLast(120);
        insert(2,12);
        countnode();
        indexofnode(2);
        reverse();
        deletefirst();
        display();
        deleteindex(3);





    }

    static void addFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = null;
        } else {
            node.next = head;
            head = node;
        }
    }

    static void addLast(int val) {
        if (tail == null) {
            addFirst(val);
        } else {
            Node newnode = new Node(val);
            tail.next = newnode;
            tail = newnode;
        }
    }
    static void insert(int index,int val){
        if(head==null){
            tail=null;
        }
        else{
            int c=0;
            Node current=head;
            while(current!=null){
                c++;
                if(index==c){
                    Node node =new Node(val);
                    Node temp=current.next;
                    current.next=node;
                    node.next=temp;
                }
                current =current.next;
            }
            display();
        }
    }
    static void deleteindex(int index){
        int c=0;
        Node temp=head;
        while(temp.next!=null){
            if(head==null){
                tail=null;
            }
            else{
                if(c==index){
                    temp.next=temp.next.next;
                }
            }
        }
        display();
    }

    static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    static int countnode() {
        Node current = head;
        int c = 0;
        while (current != null) {
            c++;
            current = current.next;
        }
        return c;
    }

    static void reverse() {
        Node pre = null, temp = head, after;
        head = tail;
        tail = temp;
        while (temp != null) {
            after = temp.next;
            temp.next = pre;
            pre = temp;
            temp = after;
        }
        display();

    }

    static void deletefirst() {
        if (head == null) {
            tail = null;
            System.out.println("Linnked list is empty");
        } else {
            head = head.next;
        }
        display();
    }

    static void indexofnode(int index) {
        int c = 0;
        Node current = head;
        while (current != null) {
            if (c == index) {
                System.out.println(current.val);
            }
            c++;
            current = current.next;
        }

    }
    /*static void deletelast() {
        if (tail == null) {
            System.out.println("List is empty");
        }
        else {
            indexofnode((countnode()-2));
        }
        }
    }*/

}
 class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}


