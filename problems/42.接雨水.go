/*
 * @lc app=leetcode.cn id=42 lang=golang
 *
 * [42] 接雨水
 *
 * https://leetcode.cn/problems/trapping-rain-water/description/
 *
 * algorithms
 * Hard (61.40%)
 * Likes:    3595
 * Dislikes: 0
 * Total Accepted:    519.3K
 * Total Submissions: 845.7K
 * Testcase Example:  '[0,1,0,2,1,0,1,3,2,1,2,1]'
 *
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 *
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 *
 *
 * 示例 2：
 *
 *
 * 输入：height = [4,2,0,3,2,5]
 * 输出：9
 *
 *
 *
 *
 * 提示：
 *
 *
 * n == height.length
 * 1 <= n <= 2 * 10^4
 * 0 <= height[i] <= 10^5
 *
 *
 */

// @lc code=start
// 面积法
// https://leetcode.cn/problems/trapping-rain-water/solution/jie-yu-shui-by-ursmile-g0vp/
func trap1(height []int) int {
	res, hl, hr := 0, 0, 0
	for l, r := 0, len(height)-1; r >= 0; l, r = l+1, r-1 {
		if height[l] > hl {
			hl = height[l]
		}
		if height[r] > hr {
			hr = height[r]
		}
		res += hl + hr - height[l]
	}
	return res - len(height)*hl
}

func max(nums ...int) int {
	rst := nums[0]
	for _, x := range nums {
		if x > rst {
			rst = x
		}
	}
	return rst
}

func min(nums ...int) int {
	rst := nums[0]
	for _, x := range nums {
		if x < rst {
			rst = x
		}
	}
	return rst
}

// 动态规划
func trap2(height []int) int {
	n := len(height)
	lmax, rmax := make([]int, n, n), make([]int, n, n)
	for l, r := 0, n-1; l < n; l, r = l+1, r-1 {
		if l == 0 {
			lmax[l], rmax[r] = height[l], height[r]
		} else {
			lmax[l], rmax[r] = max(height[l], lmax[l-1]), max(height[r], rmax[r+1])
		}
	}
	rst := 0
	for i := 1; i < n-1; i++ {
		rst += max(min(lmax[i-1], rmax[i+1])-height[i], 0)
	}
	return rst
}

/* 双指针
 * l 从左往右处理的对当前下表
 * r 从右往左处理的对当前下表
 * lmax l左边元素的最大值
 * rmax r右边元素的最大值
 * 几个定理：
 * 1. 在某个位置i处，它能存的水，取决于它左右两边的最大值中较小的一个
 * 2. 当我们从左往右处理到l下标时，左边的最大值lmax对它而言是可信的，但rmax对它而言是不可信的
 * 3. 当我们从右往左处理到r下标时，右边的最大值rmax对它而言是可信的，但lmax对它而言是不可信的
 * 对于位置l而言，它左边最大值一定是lmax，右边最大值“大于等于”rmax，这时候，如果lmax<rmax成立，那么它就知道自己能存多少水了，无论右边将来会不会出现更大的rmax，都不影响这个结果。 所以当lmax<rmax时，我们就希望去处理l下标，反之，我们希望去处理r下标。
 */
func trap3(height []int) int {
	res, lmax, rmax := 0, 0, 0
	for l, r := 0, len(height)-1; l <= r; {
		if lmax < rmax {
			res += max(lmax-height[l], 0)
			lmax = max(lmax, height[l])
			l++
		} else {
			res += max(rmax-height[r], 0)
			rmax = max(rmax, height[r])
			r--
		}
	}
	return res
}

// 单调栈
// https://leetcode.cn/problems/trapping-rain-water/solution/trapping-rain-water-by-ikaruga/
func trap(height []int) int {
	var stack []int
	res := 0
	for r, x := range height {
		for len(stack) > 0 && height[stack[len(stack)-1]] < x {
			cur := stack[len(stack)-1]
			stack = stack[:len(stack)-1]
			if len(stack) == 0 {
				break
			}
			l := stack[len(stack)-1]
			res += (r - l - 1) * (min(height[l], height[r]) - height[cur])
		}
		stack = append(stack, r)
	}
	return res
}

// @lc code=end

