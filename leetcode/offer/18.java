//考虑第一个节点有可能被删除，new一个额外的节点node1指向head作为新的链表头
//然后，定义一个工作节点node2，迭代链表，删除目标节点
//最后，返回node1.next
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
