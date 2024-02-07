package Queues.OwnQueue;

public class CustomQueue {
    protected int[] data;
    private static final int Deafult_size = 10;
    int end = 0;
    public CustomQueue(){
        this(Deafult_size);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull() {
        return end == data.length; // queue is full and ptr is  on last index.
    }
    public boolean isEmpty() {
        return end == 0; // queue is empty and ptr is  on 0 index.
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[0];
//        shift all the element to left by 1
        for (int i = 1; i < end ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("End ");
    }
}
