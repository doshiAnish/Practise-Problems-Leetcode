class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int i=0;
        double ans=0;
        while(ans<=n){
            ans = Math.pow(2,i);
            i++;
            if(ans==(double)n){
                return true;
            }
        }
        
        return false;
    }
}