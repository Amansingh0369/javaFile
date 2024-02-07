//class MyQueue {
//
//
////    https://leetcode.com/problems/implement-queue-using-stacks/
//    Stack<Integer> first;
//    Stack<Integer> second;
//
//    public MyQueue() {
//        first = new Stack<>();
//        second = new Stack<>();
//    }
//
//    public void push(int x) {
//        first.push(x);
//    }
//
//    public int pop() {
//        while(!first.isEmpty()){
//            second.push(first.pop());
//        }
//        int removed = second.pop();
//        while(!second.isEmpty()){
//            first.push(second.pop());
//        }
//        return removed;
//    }
//    public int peek() {
//        while(!first.isEmpty()){
//            second.push(first.pop());
//        }
//        int peeked = second.peek();
//        while(!second.isEmpty()){
//            first.push(second.pop());
//        }
//        return peeked;
//    }
//
//    public boolean empty() {
//        if(first.isEmpty()){
//            return true;
//        }
//        return false;
//    }
//}
//
