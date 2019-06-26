class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        Map<Character, Integer> hmap = new HashMap<>();
        Map<Character, Integer> hmap1 = new HashMap<>();
        
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        
        for(Character c: first){
            Integer val = hmap.get(c);
            if(!hmap.containsKey(c)){
                hmap.put(c,1);
            }
            else{
                hmap.put(c,++val);
            }
        }
        
        for(Character c: second){
            Integer val = hmap1.get(c);
            if(!hmap1.containsKey(c)){
                hmap1.put(c,1);
            }
            else{
                hmap1.put(c,++val);
            }
        }
        
        boolean answer = (hmap.equals(hmap1));
        
        return answer;
    }
}