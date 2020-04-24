//头插法
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode node = new ListNode(-1);

        while (head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = node.next;
            node.next = temp;
        }
        return node.next;
    }
}
