class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxP = 0;
        for(int i: prices){
            if(i<min) min=i;
            else if(i-min>maxP) maxP = i-min;
        }
        return maxP;
    }
}