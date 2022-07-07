/*
 * @lc app=leetcode.cn id=16 lang=golang
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
func threeSumClosest(nums []int, target int) int {
	abs := func(x int) int {
		if x < 0 {
			return -x
		}
		return x
	}
	sort.Slice(nums, func(i, j int) bool {
		return nums[i] < nums[j]
	})
	rst := 0
	min := 100000000
	for i := 0; i < len(nums)-1; i++ {
		for j, k := i+1, len(nums)-1; j < k; {
			t := nums[i] + nums[j] + nums[k]
			if abs(t-target) < min {
				min = abs(t - target)
				rst = t
			}
			if t > target {
				k--
			} else if t < target {
				j++
			} else {
				return t
			}
		}
	}
	return rst
}

// @lc code=end

