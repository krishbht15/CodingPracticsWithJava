package hackerankDS;

public class StackUsingArray {

    private int[] data;
    private int top;

    public StackUsingArray(int capacity) {
        this.data=new int[capacity];
        this.top=-1;
    }
    public int size(){
        return this.data.length;
    }
    public boolean isEmpty(){
        if(top>=0){
            return false;
        }
        return true;
    }
    public boolean isFull(){
       if(this.size()==this.data.length){
           return true;
       }
        return false;
    }

    public void push(int value) throws Exception {
        if(top==data.length-1){
            throw new Exception("Stack is full");
        }
        else {
            this.top++;
            this.data[top]=value;
        }
    }
    public int pop() throws Exception {
        if(this.top<0){
            throw new Exception("Stack is  empty");
        }
        int temp=this.data[this.top];
        this.data[this.top]=0;
        this.top--;
        return temp;
    }
    public void display(){
        for (int i = top; i >-1 ; i--) {
            System.out.println(data[i]);
        }
        System.out.println("END");
    }
}
