public class Solution {
    static final int MOD = 1000000007;

    public static int countGoodArrays(int n, int m, int k) {
        int[] prev = new int[k + 1]; // Sirf pehle row ko store karenge
        prev[0] = m; // base case: dp[1][0] = m

        for (int i = 2; i <= n; i++) {
            int[] curr = new int[k + 1]; // ab current row ko banayenge
            for (int j = 0; j <= k; j++) {

                // case 1: previous element se alag ho
                curr[j] = (int)(((long)prev[j] * (m - 1)) % MOD);

                // case 2: previous element ke barabar ho
                if (j > 0) {
                    curr[j] = (curr[j] + prev[j - 1]) % MOD;
                }
            }
            prev = curr; // current row ab previous ban jayega
        }

        return prev[k];
    }

    public static void main(String[] args) {
        int n = 40603, m = 16984, k = 29979;
        System.out.println(countGoodArrays(n, m, k));
    }
}
