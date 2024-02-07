package stacks.stack.OwnStack;

public class CustomStack {
    protected int[] data;
    private static final int Deafult_size = 10;
    int ptr = -1;
    public CustomStack(){
        this(Deafult_size);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop from an empty stack.");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot peek from an empty stack.");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length-1; // stack is full and ptr is  on last index.
    }
    public boolean isEmpty() {
        return ptr == -1; // stack is empty and ptr is  on -1 index.
    }
}
