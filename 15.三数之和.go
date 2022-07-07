/*
 * @lc app=leetcode.cn id=15 lang=golang
 *
 * [15] 三数之和
 */

// @lc code=start
func threeSum(nums []int) [][]int {
	rst := [][]int{}
	sort.Slice(nums, func(i, j int) bool {
		return nums[i] < nums[j]
	})
	if len(nums) > 0 && nums[0] > 0 {
		return rst
	}
	for i := 0; i < len(nums); i++ {
		// i去重
		if i > 0 && nums[i-1] == nums[i] {
			continue
		}
		for j, k := i+1, len(nums)-1; j < k; {
			if t := nums[i] + nums[j] + nums[k]; t == 0 {
				rst = append(rst, []int{nums[i], nums[j], nums[k]})
				j++
				k--
				// j去重
				for j < k && nums[j-1] == nums[j] {
					j++
				}
			} else if t < 0 {
				j++
			} else {
				k--
			}
		}
	}
	return rst
}

// @lc code=end

