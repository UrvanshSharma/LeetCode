class Solution {
    private final int MOD = 1_000_000_007;
    int n;
    int goal;
    int k;
    long[][] dp;

    public int numMusicPlaylists(int n, int goal, int k) {
        this.n = n;
        this.goal = goal;
        this.k = k;
        dp = new long[goal + 1][n + 1];
        for (int i = 0; i < goal; i++) {
            Arrays.fill(dp[i], -1);
        }
        return (int)solve(0, 0);
    }

    public long solve(int count_song, int count_unique) {

        if (count_song == goal) {
           if(count_unique==n){
            return 1;
           }
           return 0;
        }
        if (dp[count_song][count_unique] != -1)
            return dp[count_song][count_unique];

        long count = 0;
        //Option-1 unique song
        if (count_unique < n) {
            count += (n - count_unique) * solve(count_song + 1, count_unique + 1);
        }
        //Option-2 replay a song
        if (k < count_unique) {
            count += (count_unique - k) * solve(count_song + 1, count_unique);
        }
        dp[count_song][count_unique]=count%MOD;
        return count%MOD;
    }
}