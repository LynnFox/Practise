//方案一
//1.采用头插法逆置
//2.用数组保存链表值
class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode list = new ListNode(-1);

            int len = 0;
            while(head!=null){
                len++;
                ListNode temp = head.next;
                head.next = list.next;
                list.next = head;
                head = temp;
            }

            int[] res = new int[len];
            int i=0;
            while(list.next!=null){
                res[i++] = list.next.val;
                list = list.next;
            }
            return res;
        }
}

//方案二：栈
class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> s = new Stack<>();

        while(head!=null){
            s.push(head.val);
            head = head.next;
        }
        
        int len = s.size();
        int[] res = new int[len];
        
        for (int i = 0; i < len; i++) {
            res[i] = s.pop();
        }

        return res;
    }
}
