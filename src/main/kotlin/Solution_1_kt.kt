internal class Solution_1_kt {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealthSoFar = 0
        for (customer in accounts) {
            var currentCustomerWealth = 0
            for (bank in customer) {
                currentCustomerWealth += bank
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth)
        }
        return maxWealthSoFar
    } // Time Complexity = 0(n x m)
    // Space Complexity = 0(1)  
}