package com.dishan.leetcode.problems

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MissingNumberTest {
    @Test
    fun testSample1() {
        val nums = intArrayOf(3,0,1)
        val result = MissingNumber().solve(nums)
        assertEquals(2, result)
    }

    @Test
    fun testSample2() {
        val nums = intArrayOf(0, 1)
        val result = MissingNumber().solve(nums)
        assertEquals(2, result)
    }
}