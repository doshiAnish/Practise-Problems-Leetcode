class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        
        for(int i=0;i<s.length();i++){
            Integer val = hmap.get(s.charAt(i));
            if(hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i),++val);
            }
            else{
                hmap.put(s.charAt(i),1);   
            }
        }
        int n=0;
        for(int i=0;i<s.length();i++){
            if(hmap.get(s.charAt(i))== 1 )
                return i;
        }
        
        return -1;
    }
}