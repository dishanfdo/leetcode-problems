package com.dishan.leetcode.problems

import kotlin.test.Test
import kotlin.test.assertEquals

class JewelsAndStonesTest {

    @Test
    fun testSample1() {
        val result = JewelsAndStones().solve(jewels = "aA", stones = "aAAbbbb")
        assertEquals(3, result)
    }

    @Test
    fun testSample2() {
        val result = JewelsAndStones().solve(jewels = "z", stones = "ZZ")
        assertEquals(0, result)
    }
}