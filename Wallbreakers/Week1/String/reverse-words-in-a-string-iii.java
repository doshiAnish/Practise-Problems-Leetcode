class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for(String w: words){
            res.append(new StringBuffer(w).reverse().toString() + " ");
            System.out.println(w);
        }
        
        
        return res.toString().trim();
    }
}