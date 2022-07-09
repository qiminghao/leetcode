/*
 * @lc app=leetcode.cn id=34 lang=golang
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
func searchRange(nums []int, target int) []int {
	rst := []int{-1, -1}
	l, r := 0, len(nums)-1
	// 寻找第一个
	for l <= r {
		m := (r-l)>>1 + l
		if target > nums[m] {
			l = m + 1
		} else {
			r = m - 1
		}
	}
	if l < 0 || l >= len(nums) || nums[l] != target {
		return rst
	}
	rst[0] = l
	l, r = 0, len(nums)-1
	// 寻找最后一个
	for l <= r {
		m := (r-l)>>1 + l
		if target >= nums[m] {
			l = m + 1
		} else {
			r = m - 1
		}
	}
	rst[1] = r
	return rst
}

// @lc code=end

