package com.dishan.leetcode.problems

class MissingNumber {
    fun solve(nums: IntArray): Int {
        val n = nums.size
        val expectedSum = (n * (n + 1)) / 2
        return expectedSum - nums.sum()
    }
}