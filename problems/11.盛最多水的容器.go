/*
 * @lc app=leetcode.cn id=11 lang=golang
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
func maxArea(height []int) int {
	min := func(x, y int) int {
		if x < y {
			return x
		}
		return y
	}
	rst := 0
	for l, r := 0, len(height)-1; l < r; {
		if t := (r - l) * min(height[l], height[r]); t > rst {
			rst = t
		}
		if height[l] < height[r] {
			l++
		} else {
			r--
		}
	}
	return rst
}

// @lc code=end

