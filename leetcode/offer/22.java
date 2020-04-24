//1.跑一边链表，得到其长度len
//2.len-k得到返回的位置
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode node = head;
        int len = 0;
        while(node!=null){
            node = node.next;
            len++;
        }

        node = head;
        for(int i=1; i<=len-k; i++){
            node = node.next;
        }
        return node;
    }
}
