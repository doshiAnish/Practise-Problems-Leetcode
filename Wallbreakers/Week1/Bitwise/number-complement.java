class Solution {
    public int findComplement(int num) {
        int i=0;
        double ans=0;
        
        while(num>=ans){
            ans = Math.pow(2,i);
            i++;
            
        }
        ans = (int)(ans-1)^num; 
          
        return (int)ans;
    }
}