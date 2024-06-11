package com.dishan.leetcode.problems

import kotlin.math.min

class MaximumNumberOfBalloons {
    fun solve(text: String): Int {
        val template = mapOf(
            'b' to 1,
            'a' to 1,
            'l' to 2,
            'o' to 2,
            'n' to 1,
        )

        val frequencies = mutableMapOf<Char, Int>()
        for (char in text) {
            if (template.containsKey(char)) {
                frequencies[char] = frequencies.getOrDefault(char, 0) + 1
            }
        }

        var count = Int.MAX_VALUE
        for ((char, n) in template.entries) {
            count = min(count, (frequencies[char] ?: 0) / n)
        }
        return count
    }
}