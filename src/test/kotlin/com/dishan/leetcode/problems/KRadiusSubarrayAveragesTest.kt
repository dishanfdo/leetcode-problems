package com.dishan.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class KRadiusSubarrayAveragesTest {

    @Test
    fun testSample1() {
        val nums = intArrayOf(7, 4, 3, 9, 1, 8, 5, 2, 6)
        val k = 3
        val result = KRadiusSubarrayAverages().solve(nums, k)
        assertArrayEquals(intArrayOf(-1, -1, -1, 5, 4, 4, -1, -1, -1), result)
    }

    @Test
    fun testSample2() {
        val nums = intArrayOf(100_000)
        val k = 0
        val result = KRadiusSubarrayAverages().solve(nums, k)
        assertArrayEquals(intArrayOf(100_000), result)
    }
}