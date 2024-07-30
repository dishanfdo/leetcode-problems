package com.dishan.leetcode.problems

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RansomNoteTest {

    @Test
    fun testSample1() {
        val result = RansomNote().solve(ransomNote = "a", magazine = "b")
        assertFalse(result)
    }

    @Test
    fun testSample2() {
        val result = RansomNote().solve(ransomNote = "aa", magazine = "ab")
        assertFalse(result)
    }

    @Test
    fun testSample3() {
        val result = RansomNote().solve(ransomNote = "aa", magazine = "aab")
        assertTrue(result)
    }
}