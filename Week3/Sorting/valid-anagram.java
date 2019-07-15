class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        
        Arrays.sort(first);
        Arrays.sort(second);
        
        String sortedFirst = new String(first);
        String sortedSecond = new String(second);
        
        return sortedFirst.equals(sortedSecond);
		
    }
}