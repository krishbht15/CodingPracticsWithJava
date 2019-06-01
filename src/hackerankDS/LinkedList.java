package hackerankDS;

import java.util.Scanner;

public class LinkedList {
 Node head;

 int size;

    public LinkedList() {
        this.head = null;

        this.size = 0;
    }

    class Node {
        private int data;
        private Node next;

        public Node() {
            this.next=null;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void insertFirst(int value){
        // new node point to old head
        Node node = new Node(value);
        node.next = head;

        // now new node is new head;
        head = node;
    }

    public void insertLast(int value){
        if (head == null){
            insertFirst(value);
            return;
        }

        Node node = head;

        while (node.next != null){
            node = node.next;
        }

        // new item
        Node temp = new Node(value);

        // point next of preset last to new item
        node.next = temp;

    }
    void display(){
        Node n= head;
        while (n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    static class  Main{
        public static void main(String[] args) {
            LinkedList l= new LinkedList();
            Scanner s= new Scanner(System.in);
            int x= s.nextInt();
            for (int i = 0; i <x ; i++) {
                int temp=s.nextInt();
                l.insertLast(temp);

            }
            l.display();



        }
    }
}


