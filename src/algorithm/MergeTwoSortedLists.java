package algorithm;


/**
 * 21. Merge Two Sorted Lists
 * 
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * Example: Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 
 * @author qiminghao
 *
 */
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoSortedLists obj = new MergeTwoSortedLists();
		ListNode l1 = generateLinkedList(new int[] { 1, 2, 4 });
		ListNode l2 = generateLinkedList(new int[] { 1, 3, 4 });
		printLinkedList(l1);
		printLinkedList(l2);
		ListNode res = obj.mergeTwoLists(l1, l2);
		printLinkedList(res);
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
		ListNode p = res;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				p.next = new ListNode(l1.val);
				p = p.next;
				l1 = l1.next;
			} else {
				p.next = new ListNode(l2.val);
				p = p.next;
				l2 = l2.next;
			}
		}
		while (l1 != null) {
			p.next = new ListNode(l1.val);
			p = p.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			p.next = new ListNode(l2.val);
			p = p.next;
			l2 = l2.next;
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
		System.out.println();
	}

}