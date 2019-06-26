class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] ans = new int[col][row];
        
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                ans[i][j] = A[j][i];
            }
        }
        
        return ans;
    }
}