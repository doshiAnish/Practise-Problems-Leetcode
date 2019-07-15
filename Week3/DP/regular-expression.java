class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] arr = new boolean[s.length()+1][p.length()+1];
        
        arr[0][0] = true;
        
        for(int i=1;i<p.length()+1;i++){
            if(p.charAt(i-1)=='*'){
                arr[0][i] = arr[0][i-2];    
            }
            else{
                arr[0][i] = false;    
            }
        }
        
        for(int i=1;i<s.length()+1;i++){
            arr[i][0] = false;    
        }
        
        for(int i=1;i<s.length()+1;i++){
            for(int j=1;j<p.length()+1;j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='.'){
                    arr[i][j] = arr[i-1][j-1];
                }
                    
                else if(p.charAt(j-1)=='*'){
                    arr[i][j] = arr[i][j-2];
                    if(p.charAt(j-2) == '.' || p.charAt(j-2)==s.charAt(i-1)){
                        arr[i][j] = arr[i][j] | arr[i-1][j];
                    }
                }
                else{
                    arr[i][j] = false;
                }     
            }
        }
        
        return arr[s.length()][p.length()];
    }
}