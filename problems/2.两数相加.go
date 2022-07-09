/*
 * @lc app=leetcode.cn id=2 lang=golang
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	c, t := 0, 0
	dummy := new(ListNode)
	for l1 != nil || l2 != nil {
		if l1 == nil {
			t = c + l2.Val
			l2 = l2.Next
		} else if l2 == nil {
			t = c + l1.Val
			l1 = l1.Next
		} else {
			t = c + l1.Val + l2.Val
			l1 = l1.Next
			l2 = l2.Next
		}
		node := &ListNode{
			Val:  t % 10,
			Next: dummy.Next,
		}
		dummy.Next = node
		c = t / 10
	}
	if c > 0 {
		node := &ListNode{
			Val:  c,
			Next: dummy.Next,
		}
		dummy.Next = node
	}
	return reverse(dummy.Next)
}

func reverse(head *ListNode) *ListNode {
	dummy := new(ListNode)
	p := head
	for p != nil {
		next := p.Next
		p.Next = dummy.Next
		dummy.Next = p
		p = next
	}
	return dummy.Next
}

// @lc code=end

