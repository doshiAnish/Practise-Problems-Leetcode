class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> tmap = new TreeMap<>();
        
        int maxim = 1;
        for(int i=0;i<s.length();i++){
            Integer val = tmap.get(s.charAt(i));
            if(!tmap.containsKey(s.charAt(i))){
                tmap.put(s.charAt(i),1);
                
            }
            else{
                tmap.put(s.charAt(i),++val);
                maxim = Math.max(maxim,val);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=maxim;i>0;i--){
            for(Map.Entry<Character, Integer> ms: tmap.entrySet()){
                if(ms.getValue()==i){
                    for(int j=0;j<i;j++){
                        sb.append(ms.getKey()); 
                    }
                }    
            }
        }
        
        return sb.toString(); 
        
    }
}