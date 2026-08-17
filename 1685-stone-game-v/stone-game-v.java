import java.util.*;

class Solution {

    static int[][] dp;
    static int[] sum;

    static int f(int left, int right) {

        if (dp[left][right] != -1) {
            return dp[left][right];
        }

        int ans = 0;

        for (int mid = left; mid < right; mid++) {

            int leftSum = sum[mid + 1] - sum[left];
            int rightSum = sum[right + 1] - sum[mid + 1];

            if (leftSum <= rightSum) {
                ans = Math.max(ans, leftSum + f(left, mid));
            }

            if (leftSum >= rightSum) {
                ans = Math.max(ans, rightSum + f(mid + 1, right));
            }

            // Pruning
            if (2 * Math.min(leftSum, rightSum) <= ans) {
                break;
            }
        }

        return dp[left][right] = ans;
    }

    public int stoneGameV(int[] stoneValue) {

        int n = stoneValue.length;

        dp = new int[n + 1][n + 1];
        sum = new int[n + 1];

        Arrays.fill(dp[0], -1);

        for (int i = 1; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Prefix sum
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + stoneValue[i];
        }

        return f(0, n - 1);
    }
}