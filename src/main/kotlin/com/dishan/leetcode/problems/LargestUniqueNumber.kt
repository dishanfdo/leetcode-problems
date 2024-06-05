package com.dishan.leetcode.problems

class LargestUniqueNumber {
    fun solve(nums: IntArray): Int {
        val frequencies = mutableMapOf<Int, Int>()
        for (num in nums) {
            frequencies[num] = frequencies.getOrDefault(num, 0) + 1
        }

        var maxUniqueNumber = -1
        for ((num, count) in frequencies) {
            if (count == 1 && num > maxUniqueNumber) {
                maxUniqueNumber = num
            }
        }

        return maxUniqueNumber
    }
}