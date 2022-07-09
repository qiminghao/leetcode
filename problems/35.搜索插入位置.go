/*
 * @lc app=leetcode.cn id=35 lang=golang
 *
 * [35] 搜索插入位置
 */

// @lc code=start
func searchInsert(nums []int, target int) int {
	l, r := 0, len(nums)-1
	for l <= r {
		m := (r-l)>>1 + l
		if nums[m] < target {
			l = m + 1
		} else {
			r = m - 1
		}
	}
	return l
}

// @lc code=end

