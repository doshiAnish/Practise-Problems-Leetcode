class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] strA = A.split(" ");        
        String[] strB = B.split(" ");
    
        String[] result = new String[200];
        
        HashMap <String, Integer> hmap = new HashMap <String, Integer> ();
        int index=0;
        
        for(int i=0;i<strA.length;i++){
            Integer val = hmap.get(strA[i]);
            
            if(val==null){
                hmap.put(strA[i],1);
            }
            else{
                hmap.put(strA[i],++val);
            }
        }
        
        for(int j=0;j<strB.length;j++){
            Integer val = hmap.get(strB[j]);
            
            if(val==null){
                hmap.put(strB[j],1);
            }
            else{
                hmap.put(strB[j],++val);
            }
        }
        
        for(Map.Entry<String, Integer> m : hmap.entrySet()){
            if(m.getValue()==1){
                result[index] = m.getKey();
                index++;
            }
        }
        String[] answer = new String[index];
        for(int k=0;k<index;k++){
            answer[k]=result[k];
        }
        return answer;
    }
}