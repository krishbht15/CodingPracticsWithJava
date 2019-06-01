package hackerankDS;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

    class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();

        public Node(int data) {
            this.data = data;
            this.children=new ArrayList<>();
        }
    }
    private int size;
    private Node root;

    public GenericTree() {
        Scanner s= new Scanner(System.in);
        this.root=takeInput(s,null,0);
    }
    public Node takeInput(Scanner s,Node parent,int ithchild){
        if(parent==null){
            System.out.println("Enter the data for the root ");
        }
        else {
            System.out.println("Enter the data for the "+ithchild+"th child of "+parent.data);

        }
        int nodeData=s.nextInt();
        Node newNode=new Node(nodeData);
        this.size++;
        System.out.println("enter the number of children for "+nodeData);
        int noofchildren=s.nextInt();
        for (int i = 0; i <noofchildren ; i++) {
            Node child=takeInput(s,newNode,i);
            newNode.children.add(child);

        }
    return  newNode;}
    public void display(){
        this.display(this.root);
    }
    private void display(Node root){
        String  str=root.data+"=>";
        for (int i = 0; i <root.children.size(); i++) {
            str=str+root.children.get(i).data+"=>";
        }
        str=str+"END";
        System.out.println(str);
    }
}
class Main{

    public static void main(String[] args) {
        GenericTree genericTree=new GenericTree();
        genericTree.display();
    }
}