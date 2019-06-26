class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(hmap.containsKey(rem)){
                res[0] = hmap.get(rem);
                res[1] = i;
            }
             hmap.put(nums[i],i);
        }
        
        return res;
    }
}