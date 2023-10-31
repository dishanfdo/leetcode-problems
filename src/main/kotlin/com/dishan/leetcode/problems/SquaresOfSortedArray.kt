package com.dishan.leetcode.problems

import kotlin.math.abs

class SquaresOfSortedArray {
    fun solve(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)

        var left = 0
        var right = n - 1

        var i = n - 1

        while (i >= 0) {
            val square: Int
            if (abs(nums[left]) < abs(nums[right])) {
                square = nums[right]
                right--
            } else {
                square = nums[left]
                left++
            }
            result[i] = square * square
            i--
        }

        return result
    }
}