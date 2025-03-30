package problems;


public class Knapsack {

    // Method to solve 0/1 Knapsack problem
    public static int knapsack(int[] weights, int[] values, int W) {
        int n = weights.length;

        // dp[i][w] will store the maximum value that can be obtained using the first i items and a weight limit w
        int[][] dp = new int[n + 1][W + 1];

        // Build the dp array
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // The maximum value that can be obtained with the given weight limit is stored in dp[n][W]
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] weights = {1, 3, 4, 5};  // Weights of the items
        int[] values = {1, 4, 5, 7};   // Values of the items
        int W = 7;  // Maximum weight capacity of the knapsack

        int maxValue = knapsack(weights, values, W);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
}
