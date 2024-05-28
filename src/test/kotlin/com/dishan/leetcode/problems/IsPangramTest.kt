package com.dishan.leetcode.problems

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IsPangramTest {
    @Test
    fun testSample1() {
        val sentence = "thequickbrownfoxjumpsoverthelazydog"
        val result = IsPangram().solve(sentence)
        assertEquals(true, result)
    }

    @Test
    fun testSample2() {
        val sentence = "leetcode"
        val result = IsPangram().solve(sentence)
        assertEquals(false, result)
    }
}