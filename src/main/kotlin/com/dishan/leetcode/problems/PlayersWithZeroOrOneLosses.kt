package com.dishan.leetcode.problems

class PlayersWithZeroOrOneLosses {
    fun solve(matches: Array<IntArray>): List<List<Int>> {
        val lossCounts = mutableMapOf<Int, Int>()
        for (match in matches) {
            val loser = match[1]
            val winner = match[0]
            lossCounts[loser] = lossCounts.getOrDefault(loser, 0) + 1
            if (!lossCounts.contains(winner)) {
                lossCounts[winner] = 0
            }
        }

        val allWinners = lossCounts.entries.filter { it.value == 0 }.map { it.key }.sorted()
        val oneMatchLosers = lossCounts.entries.filter { it.value == 1 }.map { it.key }.sorted()

        return listOf(
            allWinners,
            oneMatchLosers
        )
    }
}