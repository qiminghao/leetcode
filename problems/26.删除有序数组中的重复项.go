/*
 * @lc app=leetcode.cn id=26 lang=golang
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
func removeDuplicates(nums []int) int {
	index := 0
	for i := 0; i < len(nums); {
		nums[index] = nums[i]
		i++
		index++
		for i < len(nums) && nums[i] == nums[i-1] {
			i++
		}
	}
	return index
}

// @lc code=end

