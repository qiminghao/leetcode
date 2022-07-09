/*
 * @lc app=leetcode.cn id=4 lang=golang
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
/*
 * 记两个数组的长度分别为m, n
 * 假设 m < n
 */
func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
	m, n := len(nums1), len(nums2)
	if n < m {
		nums1, nums2 = nums2, nums1
	}

}

// @lc code=end

