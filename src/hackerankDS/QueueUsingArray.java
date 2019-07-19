package hackerankDS;

public class QueueUsingArray {
private int[] data;
private int front;
private int size;

    public QueueUsingArray(int s) {
        this.size = 0;
        this.data=new int[s];
        this.front=-1;

    }
    public QueueUsingArray(){
        this.size = 10;
        this.data=new int[this.size];
        this.front=0;
    }
    public boolean isFull(){
        return this.size==this.data.length;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public void enque(int a) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        this.front=this.front+1;
        int ai= (this.size+this.front)%this.data.length;
        this.data[ai]=a;
        this.size++;
    }
    public int dequeue() throws  Exception{
        if(isEmpty()){
            throw new Exception("is empty");
        }

        int a=this.data[this.front];
        this.data[this.front]=0;
        this.front--;
        this.size--;
        return a;

    }
    public int getSize(){
        return this.size;
    }
}
