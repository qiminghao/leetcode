package algorithm;


/**
 * 160. Intersection of Two Linked Lists
 * 
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * 
 * Notes:
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * 
 * @author qiminghao
 *
 */
public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		if (headA.equals(headB))
			return headA;
		ListNode p = headA, q = headB;
		int flag = 0;
		while (flag < 3) {
			p = p.next;
			q = q.next;
			if (p == null) {
				p = headB;
				flag++;
			}
			if (q == null) {
				q = headA;
				flag++;
			}
			if (p.equals(q)) {
				return p;
			}
		}
		return null;
	}
}
