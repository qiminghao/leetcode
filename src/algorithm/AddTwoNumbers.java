package algorithm;

import javax.lang.model.type.NullType;

/**
 * 2. Add Two Numbers
 *  You are given two non-empty linked lists representing two
 * non-negative integers. The digits are stored in reverse order and each of
 * their nodes contain a single digit. Add the two numbers and return it as a
 * linked list. 
 * 	You may assume the two numbers do not contain any leading zero, except the number 0 itself. 
 * Example: 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8 Explanation: 342 + 465 = 807.
 * 
 * @author qiminghao
 *
 */

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddTwoNumbers obj = new AddTwoNumbers();
		ListNode l1 = generateLinkedList(new int[] { 2, 4, 3 });
		ListNode l2 = generateLinkedList(new int[] { 5, 6, 4 });
		ListNode res = obj.addTwoNumbers(l1, l2);
		printLinkedList(res);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
		ListNode p = res;
		int C = 0;
		while (l1 != null && l2 != null) {
			int tmp = l1.val + l2.val + C;
			p.next = new ListNode(tmp % 10);
			C = tmp / 10;
			p = p.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			int tmp = l1.val + C;
			p.next = new ListNode(tmp % 10);
			C = tmp / 10;
			p = p.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			int tmp = l2.val + C;
			p.next = new ListNode(tmp % 10);
			C = tmp / 10;
			p = p.next;
			l2 = l2.next;
		}
		if (C != 0) {
			p.next = new ListNode(C);
		}
		return res.next;
	}

	public static ListNode generateLinkedList(int[] nums) {
		ListNode res = new ListNode(0);
		ListNode cur = res;
		for (int i = 0; i < nums.length; i++) {
			cur.next = new ListNode(nums[i]);
			cur = cur.next;
		}
		return res.next;
	}

	public static void printLinkedList(ListNode list) {
		while (list != null) {
			System.out.print(list.val);
			if (list.next != null) {
				System.out.print(" -> ");
			}
			list = list.next;
		}
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
