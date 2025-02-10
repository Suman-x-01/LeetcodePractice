package com.LeetCode;

class Node {
	int val;
	Node next;

	Node(int val) {
		this.val = val;
	}

	Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
}

public class Merge2ShortedList_21 {
	public static Node MergeList(Node l1, Node l2) {
		Node l3 = new Node(-1);
		Node current = l3;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {

				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}
		if (l1 != null) current.next = l1;
		if (l2 != null) {
			current.next = l2;
		}
		return l3.next;
	}
	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		Merge2ShortedList_21 solution = new Merge2ShortedList_21();
		Node list1 = new Node(1, new Node(2, new Node(4)));
		Node list2 = new Node(1, new Node(3, new Node(4)));

		Node merged1 = solution.MergeList(list1, list2);
		printList(merged1); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> null
	}
}
