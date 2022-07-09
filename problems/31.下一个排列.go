/*
 * @lc app=leetcode.cn id=31 lang=golang
 *
 * [31] 下一个排列
 */

// @lc code=start
func nextPermutation(nums []int) {
	i := len(nums) - 2
	// 数组可能有重复，这里不需要严格递增，所以用>=
	for i >= 0 && nums[i] >= nums[i+1] {
		i--
	}
	if i < 0 {
		reverse(nums, 0, len(nums)-1)
		return
	}
	j := i + 1
	for j < len(nums) && nums[j] > nums[i] {
		j++
	}
	j--
	nums[i], nums[j] = nums[j], nums[i]
	reverse(nums, i+1, len(nums)-1)
}

func reverse(nums []int, i, j int) {
	for i < j {
		nums[i], nums[j] = nums[j], nums[i]
		i++
		j--
	}
}

// @lc code=end

