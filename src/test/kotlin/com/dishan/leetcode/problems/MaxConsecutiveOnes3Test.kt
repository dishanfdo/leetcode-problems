package com.dishan.leetcode.problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MaxConsecutiveOnes3Test {
    @Test
    fun testSample1() {
        val nums = intArrayOf(1,1,1,0,0,0,1,1,1,1,0)
        val k = 2
        val result = MaxConsecutiveOnes3.solve(nums, k)
        assertEquals(6, result)
    }

    @Test
    fun testSample2() {
        val nums = intArrayOf(0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1)
        val k = 3
        val result = MaxConsecutiveOnes3.solve(nums, k)
        assertEquals(10, result)
    }

    @Test
    fun testSingletonArray() {
        val nums = intArrayOf(0)
        val k = 1
        val result = MaxConsecutiveOnes3.solve(nums, k)
        assertEquals(1, result)
    }

    @Test
    fun testSingletonArray2() {
        val nums = intArrayOf(0)
        val k = 0
        val result = MaxConsecutiveOnes3.solve(nums, k)
        assertEquals(0, result)
    }
}