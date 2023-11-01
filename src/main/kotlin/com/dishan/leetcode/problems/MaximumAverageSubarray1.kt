package com.dishan.leetcode.problems

import kotlin.math.max

class MaximumAverageSubarray1 {

    companion object {
        fun solve(nums: IntArray, k: Int): Double {
            var sum = nums.take(k).sum()
            var maxSum = sum

            for (i in k ..< nums.size) {
                sum += nums[i] - nums[i - k]
                maxSum = max(maxSum, sum)
            }

            return maxSum.toDouble() / k
        }
    }
}