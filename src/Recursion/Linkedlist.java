package Recursion;

public class Linkedlist {
    static Node head=null;
    static Node tail=null;
    public static void main(String [] args){


    }
    static void addusingrecur(int index,int val){
         recurs(index,val,head);

    }
    static boolean recurs(int index, int val, Node head){
        Node node =new Node(val);
        Node current = head;
        if(index==current.val && recurs(index,val,current.next)){
            current.next=node;
            node.next=current.next;
        }
        return false;
    }
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
        Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
}
