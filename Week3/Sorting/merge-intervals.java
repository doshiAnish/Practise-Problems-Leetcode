class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] ans = new int[intervals.length][2];
        List<int[]> list = new ArrayList<int[]>();
        
        if(intervals.length==0)
            return new int[0][0];
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] n){
                return a[0]-n[0];
            }
        });
        
        
        int c1=0,c2=1,j=0;
        ans[0][0] = intervals[0][0];
        ans[0][1] = intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][c1]<=ans[j][c2]){
                ans[j][c2]= Math.max(ans[j][c2],intervals[i][c2]);
            }    
            else{
                list.add(ans[j]);
                j++;
                ans[j][c1]=intervals[i][c1];
                ans[j][c2]=intervals[i][c2];
            }
        
        }
        list.add(ans[j]);

        return list.toArray(new int[list.size()][2]);
    }
}