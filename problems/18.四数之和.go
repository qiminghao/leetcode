/*
 * @lc app=leetcode.cn id=18 lang=golang
 *
 * [18] 四数之和
 */

// @lc code=start
func fourSum(nums []int, target int) [][]int {
	sort.Slice(nums, func(i, j int) bool {
		return nums[i] < nums[j]
	})
	var rst [][]int
	for i := 0; i < len(nums); i++ {
		// i去重
		if i > 0 && nums[i-1] == nums[i] {
			continue
		}
		for j := i + 1; j < len(nums); j++ {
			// j去重
			if j > i+1 && nums[j-1] == nums[j] {
				continue
			}
			for k, l := j+1, len(nums)-1; k < l; {
				if t := nums[i] + nums[j] + nums[k] + nums[l]; t < target {
					k++
				} else if t > target {
					l--
				} else {
					rst = append(rst, []int{nums[i], nums[j], nums[k], nums[l]})
					k++
					l--
					// k去重
					for k < l && nums[k-1] == nums[k] {
						k++
					}
					// l去重
					for k < l && nums[l+1] == nums[l] {
						l--
					}
				}
			}
		}
	}
	return rst
}

// @lc code=end

