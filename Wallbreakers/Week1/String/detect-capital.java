\class Solution {
    public boolean detectCapitalUse(String word) {
        char[] letters = word.toCharArray();
        int count=0;
        for(int i=0;i<letters.length;i++){
            boolean ans = Character.isUpperCase(letters[i]);
            if(ans==true){
                count=count+1;
            }
        }
        
        if(count==letters.length || count==0){
            return true;
        }
        else if(count==1){
            if(Character.isUpperCase(letters[0])){
                return true;
            }
        }
        
        return false;
    }
}