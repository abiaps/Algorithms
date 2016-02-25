/*Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.*/
		
		
public class RemoveDuplicateSortedLinkedList 
{
public ListNode deleteDuplicates(ListNode head) 
{
	 ListNode temp=head;
	 ListNode curr=head;
	 ListNode prev=head;
	 if(head==null)
	     return null;
	 while(curr!=null)
	 {
		    temp=curr.next;
		    prev=curr;
			while(temp!=null)
			{
				if(curr.val==temp.val)
				{
					prev.next=temp.next;
					temp=prev.next;
				}
				else
				{
				  	temp=temp.next;	
					prev=prev.next;  
				}
				
			}
			curr=curr.next;
			
		}
		
		return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ls=new ListNode(3);
		RemoveDuplicateSortedLinkedList rm=new RemoveDuplicateSortedLinkedList();
		System.out.println(rm.deleteDuplicates(ls));
	}

}
