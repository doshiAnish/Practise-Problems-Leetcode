class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] flip = new int[row][col];
        
        for(int i=0;i<row;i++){
            int l=0;    
            for(int j=col-1;j>=0;j--){
                flip[i][l] = A[i][j];
                l++;
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(flip[i][j]==0){
                    flip[i][j] = 1;
                }
                else{
                    flip[i][j] = 0;
                }
            }
        }
        
        return flip;
    }
}