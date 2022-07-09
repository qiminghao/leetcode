/*
 * @lc app=leetcode.cn id=33 lang=golang
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
func search(nums []int, target int) int {
	for l, r := 0, len(nums)-1; l <= r; {
		m := (r-l)>>1 + l
		if nums[m] == target {
			return m
		}
		// nums[m] >= nums[l]表示[l, m]有序
		if nums[m] >= nums[l] {
			if nums[l] <= target &&
				target < nums[m] {
				r = m - 1
			} else {
				l = m + 1
			}
		} else {
			if nums[r] >= target && target > nums[m] {
				l = m + 1
			} else {
				r = m - 1
			}
		}
	}
	return -1
}

// @lc code=end

