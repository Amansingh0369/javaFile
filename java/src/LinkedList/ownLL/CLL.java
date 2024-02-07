package LinkedList.ownLL;

public class CLL {
    private Node head;
    private Node tail;

    public void insertlast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.Value == val){
           head = head.next;
           tail.next = head;
           return;
        }
        do{
            Node n = node.next;
            if( n.Value == val){
                node.next = n.next;
            }
            node = node.next;
        }while(node!=head);


    }
    public void display(){
        Node temp = head;
//        while(temp!= tail){
//            System.out.print(temp.Value +" -> ");
//            temp = temp.next;
//        }

        if(head != null){
            do{
                System.out.print(temp.Value+" -> ");
                temp = temp.next;
            }while(temp!=head);
        }
        System.out.println("head");
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.Value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    private class Node{
       private int Value;
       private Node next;

        public Node(int value) {
            Value = value;
        }
    }
}
