class Solution {
    public int getDecimalValue(ListNode head) {
      
        double r=0;
        double i=0;
        ListNode prev=null;
        while(head != null){
            ListNode node=head.next;
            head.next=prev;
            prev=head;
            head =node;
        }
        while(prev != null){
            r +=(Math.pow(2,i) * prev.val);
            i++;
            prev =prev.next;
        }
        int r2=(int)r;
        return r2;
    }
}