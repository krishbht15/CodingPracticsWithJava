package hackerankDS;

import java.util.Scanner;

public class BinaryTree {
    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    Node root=null;
    int size=0;

    public BinaryTree() {
        Scanner s= new Scanner(System.in);
        this.root=takeInput(s,null,false);
    }

    private Node takeInput(Scanner s, Node parent, boolean isLeftorRight) {
        if(parent==null){
            System.out.println("enter the data of your ROOT node");
        }
        else {
            if(isLeftorRight==false){
                System.out.println("Enter the Right child of "+parent.data);
            }
            else {
                System.out.println("Enter the Left child of "+parent.data);

            }
        }
        int newData=s.nextInt();
        Node newNode=new Node(newData,null,null);
        this.size++;
        if (parent==null){
            this.root=newNode;
        }

        boolean temp=false;
        System.out.println("Do you have a left child of "+newData);
        temp=s.nextBoolean();
        if(temp){
            newNode.left=takeInput(s,newNode,true);
        }
        temp=false;
        System.out.println("Do you have a Right child of "+newData);
        temp=s.nextBoolean();
        if(temp){
            newNode.right=takeInput(s,newNode,false);
        }
    return newNode;}
        public void display(){
        this.display(this.root);
        }

    private void display(Node root) {
        String str="";
        if(root.left!=null){
            str=str+root.left.data+"=>";
        }
        else{
            str=str+"END"+"=>";
        }

        str=str+root.data;


        if(root.right!=null){
            str=str+"<="+root.right.data;
        }
        else{
            str=str+"<="+"END";
        }
        System.out.println(str);

    }
    public int getHeight(){
        return this.getHeight(this.root);
    }

    private int getHeight(Node root) {
        if(root==null){
            return -1;
        }

        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    public void preorder(){
        this.preorder(this.root);
    }

    private void preorder(Node root) {
        if (root==null){
            return;
        }
        System.out.println(root.data + ", ");
        preorder(root.left);
        preorder(root.right);

    }
    void travLeft(Node root){
        if(root.left!= null)
        { travLeft(root.left);}
        System.out.printf("%d ",root.data);
    }
    void travRight(Node root){
        System.out.printf("%d ",root.data);
        if(root.right!= null){
            travRight(root.right);}
    }

    void topView(Node root) {
        if(root.left != null){
            travLeft(root.left);
        }
        System.out.printf("%d ",root.data);
        if(root.right != null){
            travRight(root.right);
        }
    }

}
 class Mains{
    public static void main(String[] args) {
        BinaryTree b=new BinaryTree();
//        b.display();
//        System.out.println(b.getHeight());
        b.topView(b.root);

    }
}
///65 true 3 true 4 false false false false
//1 true 2 true 4 false true 7 false false true 5 false false true 3 false true 6 true 8 false false false