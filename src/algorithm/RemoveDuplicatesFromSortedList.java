package algorithm;

/**
 * 83. Remove Duplicates from Sorted List
 * 
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * Example 1: Input: 1->1->2 Output: 1->2
 * 
 * Example 2: Input: 1->1->2->3->3 Output: 1->2->3
 * 
 * @author qiminghao
 *
 */
public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();
		ListNode head = generateLinkedList(new int[] { 1, 1, 2, 3, 3 });
		printLinkedList(head);
		ListNode res = obj.deleteDuplicates(head);
		printLinkedList(res);
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		ListNode res = new ListNode(head.val);
		ListNode pre = head, cur = head.next, p = res;
		while (cur != null) {
			if (pre.val != cur.val) {
				p.next = new ListNode(cur.val);
				p = p.next;
			}
			cur = cur.next;
			pre = pre.next;
		}
		return res;
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
