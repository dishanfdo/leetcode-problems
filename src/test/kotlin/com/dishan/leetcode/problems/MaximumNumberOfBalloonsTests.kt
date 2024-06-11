package com.dishan.leetcode.problems

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaximumNumberOfBalloonsTests {
    @Test
    fun testSample1() {
        val text = "nlaebolko"
        val result = MaximumNumberOfBalloons().solve(text)
        assertEquals(1, result)
    }

    @Test
    fun testSample2() {
        val text = "loonbalxballpoon"
        val result = MaximumNumberOfBalloons().solve(text)
        assertEquals(2, result)
    }

    @Test
    fun testSample3() {
        val text = "leetcode"
        val result = MaximumNumberOfBalloons().solve(text)
        assertEquals(0, result)
    }
}