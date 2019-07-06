class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> hset = new HashSet<>();
        for(int i: candies){
            hset.add(i);
        }
        return Math.min(hset.size(), candies.length/2);  
    }
}