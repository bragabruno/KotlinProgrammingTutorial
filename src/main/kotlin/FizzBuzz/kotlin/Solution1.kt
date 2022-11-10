package FizzBuzz.kotlin

class Solution1 {
    fun fizzBuzz(n: Int): List<String> {
        val answer: MutableList<String> = ArrayList(n)
        for (i in 1..n) {
            val divisibleBy3 = i % 3 == 0
            val divisibleBy5 = i % 5 == 0
            if (divisibleBy3 && divisibleBy5) {
                answer.add("FizzBuzz")
            } else if (divisibleBy3) {
                answer.add("Fizz")
            } else if (divisibleBy5) {
                answer.add("Buzz")
            } else {
                answer.add(i.toString())
            }
        }
        return answer
    } // Time complexity = O(n)
    // Space complexity = 0(1)
}