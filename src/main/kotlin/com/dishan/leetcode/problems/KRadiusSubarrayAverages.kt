package com.dishan.leetcode.problems

class KRadiusSubarrayAverages {
    fun solve(nums: IntArray, k: Int): IntArray {
        if (k == 0) return nums

        val n = nums.size
        val wSize = 2 * k + 1
        val averages = IntArray(n) { -1 }
        if (wSize > n) {
            return averages
        }

        var sum: Long = 0
        for (i in 0 ..< wSize) {
            sum += nums[i]
        }
        averages[k] = (sum / wSize.toLong()).toInt()

        for (i in wSize ..< n) {
            sum = sum + nums[i] - nums[i - wSize]
            averages[i - k] = (sum / wSize.toLong()).toInt()
        }

        return averages
    }
}