class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hmapS = new HashMap<Character, Character>();
        Map<Character, Character> hmapT = new HashMap<Character, Character>();
        
        for(int i=0;i<s.length();i++){
            if(!hmapS.containsKey(s.charAt(i))){
                hmapS.put(s.charAt(i), t.charAt(i));
            }
            else{
                if(hmapS.get(s.charAt(i))!=(t.charAt(i))) {return false;}
            }
        }
        
        
        for(int i=0;i<t.length();i++){
            if(!hmapT.containsKey(t.charAt(i))){
                hmapT.put(t.charAt(i), s.charAt(i));
            }
            else{
                if(hmapT.get(t.charAt(i))!=(s.charAt(i))) {return false;}
            }
        }
        
        return true;
    }
}