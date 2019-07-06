class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
    
        char[] pTwo = p.toCharArray();
        Arrays.sort(pTwo);
        String pattern = new String(pTwo);
        
        int limit = s.length()-p.length()+1;
        for(int i=0;i<limit;i++){
            String subStr = s.substring(i,i+p.length());
            char[] two = subStr.toCharArray();
            Arrays.sort(two);
            String subs = new String(two);
            if(subs.equals(pattern)) {
                list.add(i);
            }
        }
        
        return list;
    }
}