/*
 * @lc app=leetcode.cn id=1 lang=golang
 *
 * [1] 两数之和
 */

// @lc code=start
func twoSum(nums []int, target int) []int {
	dict := make(map[int]int, len(nums))
	for i := len(nums) - 1; i >= 0; i-- {
		if j, ok := dict[target-nums[i]]; ok {
			return []int{i, j}
		}
		dict[nums[i]] = i
	}
	return []int{0, 0}
}

// @lc code=end

