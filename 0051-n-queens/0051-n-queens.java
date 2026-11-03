class Solution {
    char[][] board;
    int size;
    List<List<String>> result = new ArrayList<>();
    boolean[] col;
    boolean[] left;
    boolean[] right;
    void helper(int n,int row){
        if(row==n){
            List<String> x = new ArrayList<>();
            for(char[] arr: board){
                x.add(new String(arr));
            }
            result.add(x);
            return;
        }
        for(int c = 0;c < n; c++){
            if(col[c]||left[row-c+n-1]||right[row+c]){
                continue;
            }
            board[row][c]='Q';
            col[c]=true;
            left[row-c+n-1]=true;
            right[row+c]=true;
            helper(n,row+1);
            board[row][c]='.';
            col[c]=false;
            left[row-c+n-1]=false;
            right[row+c]=false;
        }
    }
    public List<List<String>> solveNQueens(int n) {
        size = n;
        board = new char[n][n];
        col = new boolean[n];
        left = new boolean[2 * n - 1];
        right = new boolean[2 * n - 1];
        for(char[] arr:board){
            Arrays.fill(arr,'.');
        }
        helper(n,0);
        return result;
    }
}