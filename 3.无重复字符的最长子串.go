/*
 * @lc app=leetcode.cn id=3 lang=golang
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
func lengthOfLongestSubstring(s string) int {
	max := 0
	dict := map[uint8]bool{}
	i, j := 0, 0
	for i < len(s) {
		for j < len(s) && !dict[s[j]] {
			dict[s[j]] = true
			j++
		}
		if len(dict) > max {
			max = len(dict)
		}
		delete(dict, s[i])
		i++
	}
	return max
}

// @lc code=end

