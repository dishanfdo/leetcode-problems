package com.dishan.leetcode.problems

class RunningSumOfArray {
    fun solve(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)
        ans[0] = nums[0]
        for (i in 1 ..< nums.size) {
            ans[i] = ans[i - 1] + nums[i]
        }
        return ans
    }
}