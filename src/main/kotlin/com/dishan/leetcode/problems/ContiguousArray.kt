package com.dishan.leetcode.problems

class ContiguousArray {
    fun solve(nums: IntArray): Int {
        val diffs = mutableMapOf<Int, Int>()
        diffs[0] = -1

        var diff = 0
        var maxContiguousLength = 0
        for (i in nums.indices) {
            val delta = if (nums[i] == 0) 1 else -1
            diff += delta

            if (diffs.containsKey(diff)) {
                maxContiguousLength = maxOf(maxContiguousLength, i - diffs[diff]!!)
            } else {
                diffs[diff] = i
            }

        }

        return maxContiguousLength
    }
}