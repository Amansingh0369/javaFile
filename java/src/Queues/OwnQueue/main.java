package Queues.OwnQueue;

public class main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.display();
//        System.out.println( queue.remove());
//        queue.display();

//        circularQueue queue = new circularQueue(4);
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//
//        queue.display();
//        System.out.println( queue.remove());
//        queue.display();
//        queue.insert(5);
//        queue.display();
    }
}
