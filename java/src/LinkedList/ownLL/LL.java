package LinkedList.ownLL;

public class LL {
    private Node tail;
    private Node head;
    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public static void main(String[] args) {
    }

    public void insertLast(int val){
        if(tail== null){
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int val,int index){
        if(index == 0){
            insertfirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;

        }
        Node node = new Node(val,temp.next);
        temp.next = node;

        size += 1;
    }

    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val,index-1, node.next);
        return node;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;

    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;

    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node pre = get(index-1);
        int val = pre.next.value;
        pre.next = pre.next.next;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node = head;
        for(int i = 0; i<index;i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private class Node{
       private int value;
       private Node next;

       public Node(int value) {
           this.value = value;
       }

       public Node(int value,Node next) {
           this.value = value;
           this.next = next;
       }
    }


//    Questoion leet code;
//    https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
    public void duplicate(){
        Node node = head;
        while(node.next!=null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //Questoion merge code;(merge also)>!!!!
//    https://leetcode.com/problems/merge-two-sorted-lists/submissions/
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();
        while(f!=null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }
    //question cycle check in LL in leetcode
//    https://leetcode.com/problems/linked-list-cycle/description/
    public static boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    // nodes in cycle if present
    public static int lengthOfCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                int length = 0;
                Node temp = slow;
                do {
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }

    //question cycl II check in LL in leetcode
//    https://leetcode.com/problems/linked-list-cycle-ii/
    public static Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;
        int length=0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                Node temp = slow;
                do{
                    slow = slow.next;
                    length++;
                }while(fast!=slow);
                break;
            }
        }
        if (length == 0){
            return null;
        }
        Node first = head;
        Node second = head;
        while(length > 0){
            second = second.next;
            length--;
        }
        while(second != first){
            second = second.next;
            first = first.next;
        }
        return first;
    }

    //leetcode question happyNumber 202.
//    https://leetcode.com/problems/happy-number/
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSq(slow);
            fast = findSq(findSq(fast));
        } while(fast!=slow);
        if(slow==1){
            return true;
        }
        return false;

    }
    private static int findSq(int number){
        int ans = 0;
        while(number>0){
            int rem = number%10;
            ans += rem*rem;
            number = number/10;
        }
        return ans;
    }

    // 876 leetcode middle of linked list
//    https://leetcode.com/problems/middle-of-the-linked-list/
    public static Node middleNode(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    //bubbleSort
    public void bubbleSort(){
         bubbleSort(size-1,0);
        return;
    }
    private  void bubbleSort(int row,int col){
        if(row == 0){
            return;
        }
        if(col<row){
            Node first = get(col);
            Node second = get(col+1);
            if(first.value > second.value){
                //swap
               Node temp = new Node(first.value);
               first.value = second.value;
               second.value = temp.value;

            }
            bubbleSort(row,col+1);
        }else{
            bubbleSort(row-1,0);
        }

    }
    //Reverise of linkedlist using recurrsion..!!
    public void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

    }
    //Reverise of linkedlist using inplace..!! 206 leetcode
    //https://leetcode.com/problems/reverse-linked-list/
    public Node reverseList(Node head) {
        if(head == null){
            return null;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    //leetcode 92 reverse linkedlist II
//    https://leetcode.com/problems/reverse-linked-list-ii/
    public Node reverseBetween(Node head, int left, int right){
        if(left == right){
            return head;
        }
        //skip the first left-1 node;
        Node current = head;
        Node prev = null;
        for(int i = 0;current != null && i <left-1;i++){
            prev = current;
            current = current.next;
        }
        Node last = prev;
        Node newEnd = current;
        //reverse bte left & right..!
        Node next = current.next;
        for(int i = 0; current != null && i< right-left+1;i++){
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if(last != null){
            last = prev.next;
        }else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
    // isPalindrome leetcode 234..!
    public boolean isPalindrome(Node head){
        Node mid = middleNode(head);
        Node midrev = reverseList(mid);
        Node first = head;
        Node second = midrev;
        while(first !=null && second != null){
            if(first.value == second.value){
                first = first.next;
                second = second.next;
            }else{
                return false;
            }
        }
        return true;
    }

    //reoder list leetcode 143
    public void reorderList(Node head) {
        if(head == null && head.next ==null){
            return;
        }
        Node mid = middleNode(head);
        Node hs =  reverseList(mid);
        Node hf = head;

        while(hf != null && hs != null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null){
            hf.next = null;
        }
    }

    // Rotate list Leetcode 61.
    public Node rotateRight(Node head, int k) {
        if(k<=0 || head == null || head.next == null){
            return head;
        }
        Node last = head;
        int length = 1;
        while (last.next != null){
            last = last.next;
            length++;
        }
        last.next = head;
        int Rotation = k % length;
        int skip= length - Rotation;
        Node newlast = head;
        for (int i = 0; i<skip-1;i++){
            newlast = newlast.next;
        }
        head = newlast.next;
        newlast.next = null;
         return head;
    }
}
