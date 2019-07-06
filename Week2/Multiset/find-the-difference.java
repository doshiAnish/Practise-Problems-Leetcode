class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> hmap = new HashMap<>();
        String str = s+t;
        for(int i=0;i<str.length();i++){
            Integer val = hmap.get(str.charAt(i)); 
            
                if(!hmap.containsKey(str.charAt(i))){
                    hmap.put(str.charAt(i),1);
                }
                else{
                    hmap.put(str.charAt(i),++val);
                }    
            
        }
        
        for(Map.Entry<Character, Integer> mp: hmap.entrySet()){
            if(mp.getValue()%2!=0) return mp.getKey();
        }
        
        return ' ';    
    }
}