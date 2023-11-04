package com.dishan.leetcode.problems

import kotlin.math.min

class MinValueToGetPositiveStepByStepSum {
    fun solve(nums: IntArray): Int {
        var sum = 0
        var min = 0

        for (num in nums) {
            sum += num
            min = min(sum, min)
        }
        
        return 1 - min
    }
}