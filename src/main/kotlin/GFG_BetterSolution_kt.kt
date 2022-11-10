import java.util.*

object GFG_BetterSolution_kt {
    fun maxProduct(arr: IntArray, n: Int) {

        // Sort the array
        Arrays.sort(arr)
        val num1: Int
        val num2: Int

        // Calculate product of two smallest numbers
        val sum1 = arr[0] * arr[1]

        // Calculate product of two largest numbers
        val sum2 = arr[n - 1] * arr[n - 2]

        // print the pairs whose product is greater
        if (sum1 > sum2) {
            num1 = arr[0]
            num2 = arr[1]
        } else {
            num1 = arr[n - 2]
            num2 = arr[n - 1]
        }
        println(
            "Max product pair = " +
                    "{" + num1 + "," + num2 + "}"
        )
    }

    // Driver Code
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 4, 3, 6, 7, 0)
        val n = arr.size
        maxProduct(arr, n)
    }
}