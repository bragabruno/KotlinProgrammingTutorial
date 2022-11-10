// product in array of Integers
internal object GFG_SimpleSolution_kt {
    // Function to find maximum product pair
    // in arr[0..n-1]
    fun maxProduct(arr: IntArray, n: Int) {
        if (n < 2) {
            println("No pairs exists")
            return
        }

        // Initialize max product pair
        var a = arr[0]
        var b = arr[1]

        // Traverse through every possible pair
        // and keep track of max product
        for (i in 0 until n) for (j in i + 1 until n) if (arr[i] * arr[j] > a * b) {
            a = arr[i]
            b = arr[j]
        }
        println(
            "Max product pair is {" +
                    a + ", " + b + "}"
        )
    }

    /* Driver program to test above function */
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 4, 3, 6, 7, 0)
        val n = arr.size
        maxProduct(arr, n)
    }
}