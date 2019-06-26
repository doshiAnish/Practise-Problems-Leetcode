class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s","").toLowerCase();
        s = s.replaceAll("\\p{Punct}","").toLowerCase();
        
        StringBuilder sb=new StringBuilder(s);  
        String temp = sb.reverse().toString();
        
        if(temp.equals(s)){
            return true;
        }
        
     return false;   
    }
}