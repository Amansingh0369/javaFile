package Heap;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<Integer>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
//        System.out.println(heap.remove());

        System.out.println(heap.heapSort());


    }
}