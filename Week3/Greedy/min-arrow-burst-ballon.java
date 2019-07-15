class Solution {
    public int findMinArrowShots(int[][] points) {
        
        if(points.length==0)
            return 0;
        
        // Arrays.sort(points, new Comparator<int[]>(){
        //     public int compare(int[] a, int[] n){
        //         return a[1]-n[1]; //sort in ascending order based on 2nd col
        //     }
        // });
        
        Arrays.sort(points, (a, b) -> a[1] - b[1]);
        
        int ans=1; //we'll use atleast one arrow
        int base = points[0][1]; //take 2nd col val as base case
        for(int i=1;i<points.length;i++){
            if(points[i][0]>base){ //if 1st col is great than base we'll need one more arrow & we'll update the base case
                ans++; 
                base = points[i][1];
            }   
        }
        return ans;

    }
}