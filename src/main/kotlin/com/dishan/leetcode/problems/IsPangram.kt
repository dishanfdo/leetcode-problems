package com.dishan.leetcode.problems

class IsPangram {
    fun solve(sentence: String): Boolean {
        return strategy2(sentence)
    }

    private fun strategy1(sentence: String): Boolean {
        val chars = ('a'..'z').toMutableSet()

        for (c in sentence) {
            chars.remove(c)
            if (chars.isEmpty()) {
                return true
            }
        }

        return false
    }

    private fun strategy2(sentence: String): Boolean {
        val chars = mutableSetOf<Char>()

        for (c in sentence) {
            chars.add(c)
            if (chars.size == 26) {
                return true
            }
        }

        return false
    }
}