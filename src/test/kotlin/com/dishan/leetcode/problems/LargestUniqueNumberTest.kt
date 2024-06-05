package com.dishan.leetcode.problems

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LargestUniqueNumberTest {
    @Test
    fun testSample1() {
        val nums = intArrayOf(5, 7, 3, 9, 4, 9, 8, 3, 1)
        val result = LargestUniqueNumber().solve(nums)
        assertEquals(8, result)
    }

    @Test
    fun testSample2() {
        val nums = intArrayOf(9, 9, 8, 8)
        val result = LargestUniqueNumber().solve(nums)
        assertEquals(-1, result)
    }

    @Test
    fun testSampleEmptyArrayOfNumbers() {
        val nums = intArrayOf()
        val result = LargestUniqueNumber().solve(nums)
        assertEquals(-1, result)
    }
}