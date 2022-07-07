/*
 * @lc app=leetcode.cn id=1145 lang=golang
 *
 * [1145] 二叉树着色游戏
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
/**
 * 将一棵树按 x 分为 3 部分
 * 例如：root = [1,2,3,4,5,6,7,8,9,10,11], n = 11, x = 3
 *                1
 *            /       \
 *           2         3
 *        /     \    /   \
 *       4       5  6     7
 *      / \     / \
 *     8   9  10  11
 * 根据x=3，将树分为 3 的左子树【6】，3 的右子树【7】和剩余部分【1,2,3,4,5,8,9,10,11】
 * 统计节点数量分别为 1 , 1, 11-1-1-1=8
 * 找到这三部分的最大节点数8为玩家二可以染色的最多节点数，剩下的为玩家一可以染色的节点数
 * 在本例中，玩家二可以选择加点 1，然后完成游戏。
 */
func btreeGameWinningMove(root *TreeNode, n int, x int) bool {
	node := findX(root, x)
	cntL := countNodes(node.Left)
	cntR := countNodes(node.Right)
	maxCnt := max(cntL, cntR, n-cntL-cntR-1)
	return maxCnt > n-maxCnt
}

func countNodes(root *TreeNode) int {
	if root == nil {
		return 0
	}
	if root.Left == nil && root.Right == nil {
		return 1
	}
	return countNodes(root.Left) + countNodes(root.Right) + 1
}

func findX(root *TreeNode, x int) *TreeNode {
	if root == nil {
		return nil
	}
	if root.Val == x {
		return root
	}
	if node := findX(root.Left, x); node != nil {
		return node
	}
	return findX(root.Right, x)
}

func max(nums ...int) int {
	rst := nums[0]
	for _, x := range nums {
		if x > rst {
			rst = x
		}
	}
	return rst
}

// @lc code=end

