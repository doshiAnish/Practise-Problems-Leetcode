class Solution {
    public int rob(int[] nums) {
        int op1=0,op2=0;
        int[] arr1 = nums.clone();
        int[] arr2 = nums.clone();
        
                if(nums.length==0){
                    return 0;
                }
        
                if(nums.length==1){
                    return nums[0];
                }
         
                for(int i=0;i<arr1.length-1;i++){
                    
                    if(i==1){
                        arr1[i] = Math.max(arr1[0], arr1[1]);
                    }
                    else if(i>1){
                        arr1[i]=Math.max(arr1[i]+arr1[i-2], arr1[i-1]);
                    }
                     op1 = arr1[nums.length-2];
                }
        
                for(int i=1;i<arr2.length;i++){
                    
                    if(i==2){
                        arr2[i] = Math.max(arr2[1], arr2[2]);
                    }
                    else if(i>2){
                        arr2[i]=Math.max(arr2[i]+arr2[i-2], arr2[i-1]);
                    }
                     op2 = arr2[nums.length-1];
                }
        
       
        
        return Math.max(op1,op2);
        
    }
}