/*
 * @lc app=leetcode.cn id=41 lang=golang
 *
 * [41] 缺失的第一个正数
 *
 * https://leetcode.cn/problems/first-missing-positive/description/
 *
 * algorithms
 * Hard (42.72%)
 * Likes:    1518
 * Dislikes: 0
 * Total Accepted:    236K
 * Total Submissions: 552.5K
 * Testcase Example:  '[1,2,0]'
 *
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：nums = [1,2,0]
 * 输出：3
 *
 *
 * 示例 2：
 *
 *
 * 输入：nums = [3,4,-1,1]
 * 输出：2
 *
 *
 * 示例 3：
 *
 *
 * 输入：nums = [7,8,9,11,12]
 * 输出：1
 *
 *
 *
 *
 * 提示：
 *
 *
 * 1 <= nums.length <= 5 * 105
 * -2^31 <= nums[i] <= 231 - 1
 *
 *
 */

// @lc code=start
func firstMissingPositive(nums []int) int {
	n := len(nums)
	for i := 0; i < n; i++ {
		for nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i] {
			nums[nums[i]-1], nums[i] = nums[i], nums[nums[i]-1]
		}
	}
	for i, x := range nums {
		if x != i+1 {
			return i + 1
		}
	}
	return len(nums) + 1
}

const T = 60000000

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}
func firstMissingPositive2(nums []int) int {
	for i, x := range nums {
		if x <= 0 {
			nums[i] = T
		}
	}
	for _, x := range nums {
		if abs(x) <= len(nums) && nums[abs(x)-1] > 0 {
			nums[abs(x)-1] = -nums[abs(x)-1]
		}
	}
	for i, x := range nums {
		if x > 0 {
			return i + 1
		}
	}
	return len(nums) + 1
}

// @lc code=end
