package FizzBuzz.kotlin

class Solution2 {
    fun fizzBuzz(n: Int): List<String> {
        val answer: MutableList<String> = ArrayList(n)
        for (i in 1..n) {
            val divisibleBy3 = i % 3 == 0
            val divisibleBy5 = i % 5 == 0
            var currStr = ""
            if (divisibleBy3) {
                currStr += "Fizz"
            }
            if (divisibleBy5) {
                currStr += "Buzz"
            }
            if (currStr.isEmpty()) {
                currStr += i.toString()
            }
            answer.add(currStr)
        }
        return answer
    } // Time complexity = 0(n)
    // Space complexity = 0(1)
}