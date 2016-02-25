public boolean isPalindrome(ListNode head)
	 {
		 if(head==null)
		       return true;
		 ListNode curr=head.next;
		 ListNode prev=new ListNode(head.val);
		 while(curr!=null)
		 {
		      ListNode temp=new ListNode(curr.val);
		      temp.next=prev;
		      curr=curr.next;
		      prev=temp;    
		 }
		 ListNode p1=head;
		 ListNode p2=prev;
		 while(p1!=null&&p2!=null)
		 {
		      if(p1.val!=p2.val)
		          return false;
		      p1=p1.next;
		      p2=p2.next;
		 }
		 return true;
	    }
