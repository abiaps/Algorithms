/*Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
          return null;
        ListNode prev=head;
        ListNode cur=null;
        if(head.next!=null)
            cur=head.next;
         else
         {
             if(head.val==val)
             return null;
         }
            
        while(cur!=null)
        {
            if(cur.val==val)
            {
                prev.next=cur.next;
                cur=prev.next;
            }
            else
            {
                prev=cur;
                cur=prev.next;
            }
                
        }
        if(head.val==val)
          return head.next;
        else
          return head;
        
    }
}
