class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> resList = new ArrayList<Integer>();
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hmap1 = new HashMap<Integer, Integer>();
        
        for(int i: nums1){
            Integer val = hmap.get(i);
            if(!hmap.containsKey(i)){
                hmap.put(i,1);
            }
            else{
                hmap.put(i,++val);
            }
        }
        
        for(int i: nums2){
            Integer val = hmap1.get(i);
            if(!hmap1.containsKey(i)){
                hmap1.put(i,1);
            }
            else{
                hmap1.put(i,++val);
            }
        }
         
         for(Map.Entry mp : hmap.entrySet()){
             if(hmap1.containsKey(mp.getKey())){
                resList.add((int)mp.getKey());     
             }            
         }
            
        int[] answer = new int[resList.size()];
        for(int a=0;a<resList.size();a++){
            answer[a]= resList.get(a);
        }
        
        return answer;
    }
}