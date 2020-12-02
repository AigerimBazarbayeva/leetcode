import java.util.ArrayList;

public class LinkedListRandomNode {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        private ArrayList<Integer> list = new ArrayList<>();
        /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
        public Solution(ListNode head) {
            while(head != null){
                this.list.add(head.val);
                head = head.next;
            }
        }

        /** Returns a random node's value. */
        public int getRandom() {
            int random = (int)(Math.random() * this.list.size());
            return this.list.get(random);
        }
    }

    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(head);
     * int param_1 = obj.getRandom();
     */

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution solution = new Solution(head);

        System.out.println(solution.getRandom());
    }

}
