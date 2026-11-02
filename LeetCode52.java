class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        count = 0;

        boolean[] ucol = new boolean[n];
        boolean[] uright = new boolean[2 * n - 1];
        boolean[] uleft = new boolean[2 * n - 1];

        helper(n, 0, ucol, uright, uleft);

        return count;
    }

    void helper(int n, int row, boolean[] ucol,
                boolean[] uright, boolean[] uleft) {

        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {

            if (ucol[col] || uright[row + col] || uleft[row - col + n - 1]) {
                continue;
            }

            ucol[col] = true;
            uright[row + col] = true;
            uleft[row - col + n - 1] = true;

            helper(n, row + 1, ucol, uright, uleft);

            // Backtracking
            ucol[col] = false;
            uright[row + col] = false;
            uleft[row - col + n - 1] = false;
        }
    }
}