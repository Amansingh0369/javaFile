package Queues.OwnQueue;

public class circularQueue {
    protected int[] data;
    private static final int Deafult_size = 10;
    protected int end = 0;
    protected int front = 0;
    protected int size = 0;
    public circularQueue(){
        this(Deafult_size);
    }
    public circularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull() {
        return size == data.length; // queue is full and ptr is  on last index.
    }
    public boolean isEmpty() {
        return size == 0; // queue is empty and ptr is  on 0 index.
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size --;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }
    public void display(){
       int i = front;
       do{
           System.out.print(data[i] + " -> ");
           i++;
           i = i % data.length;
       }while (i != end);
        System.out.println("End");
    }
}
