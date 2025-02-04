
package com.LeetCode;
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumber_2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3=new ListNode(0);
		ListNode current=l3;
		int carry=0;
		while (l1!=null || l2!=null){
			int x=(l1.next!=null)?l1.val:0;
			int y=(l2.next!=null)?l2.val:0;
			int sum=x+y+carry;
			carry=sum/10;
			current.next=new ListNode(sum%10);
			current=current.next;
			if(l1!=null)l1=l1.next;
			if (l2!=null)l2=l2.next;

		}
		if (carry>0){
			current.next=new ListNode(carry);
		}
		return current;
	}
}
