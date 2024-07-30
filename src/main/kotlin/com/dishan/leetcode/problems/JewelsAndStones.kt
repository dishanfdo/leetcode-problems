package com.dishan.leetcode.problems

class JewelsAndStones {
    fun solve(jewels: String, stones: String): Int {
        val jewelsSet = mutableSetOf<Char>()
        for (jewel in jewels) {
            jewelsSet.add(jewel)
        }

        var count = 0
        for (stone in stones) {
            if (jewelsSet.contains(stone)) {
                count++
            }
        }

        return count
    }
}