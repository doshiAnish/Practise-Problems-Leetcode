class Solution {
    public boolean wordPattern(String pattern, String str) {

        Map<Character, String> hmapS = new HashMap<>();
        Map<String, Character> hmapT = new HashMap<>();
        
        String[] wordsList = str.split(" ");
        
        if(pattern.length()!=wordsList.length) return false;
        
        for(int i=0;i<pattern.length();i++){
            if(!hmapS.containsKey(pattern.charAt(i))){
                hmapS.put(pattern.charAt(i), wordsList[i]);
            }
            else{
                if(!hmapS.get(pattern.charAt(i)).equals(wordsList[i])) {return false;}
            }
        }
        
        
        for(int i=0;i<wordsList.length;i++){
            if(!hmapT.containsKey(wordsList[i])){
                hmapT.put(wordsList[i], pattern.charAt(i));
            }
            else{
                if(hmapT.get(wordsList[i])!=(pattern.charAt(i))) {return false;}
            }
        }
        
        return true;
    }
}