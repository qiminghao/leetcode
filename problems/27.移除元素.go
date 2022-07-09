/*
 * @lc app=leetcode.cn id=27 lang=golang
 *
 * [27] 移除元素
 */

// @lc code=start
func removeElement(nums []int, val int) int {
	index := 0
	for i := 0; i < len(nums); {
		for i < len(nums) && nums[i] == val {
			i++
		}
		if i < len(nums) {
			nums[index] = nums[i]
			i++
			index++
		}
	}
	return index
}

// @lc code=end

