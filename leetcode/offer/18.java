class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode node1 = new ListNode(-1);
        node1.next = head;
        ListNode node2 = node1;
        while(node2.next.val!=val){
            node2 = node2.next;
        }
        node2.next = node2.next.next;
        return node1.next;
    }
}
