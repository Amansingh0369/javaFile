package LinkedList.ownLL;

public class mergeSort {

    private ListNode tail;
    private ListNode head;
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
        ListNode(){

        }
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode sortList(ListNode head) {
    if(head == null || head.next == null){
        return head;
    }
    ListNode mid = middleNode(head);
    ListNode left = sortList(head);
    ListNode right = sortList(mid);

    return mergeTwoLists(left,right);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        while (list1 != null) {
            tail.next = list1;
            list1 = list1.next;
            tail = tail.next;
        }
        while (list2 != null) {
            tail.next = list2;
            list2 = list2.next;
            tail = tail.next;
        }
        return head.next;
    }
    public  ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

}
