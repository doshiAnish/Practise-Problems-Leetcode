class Solution {
    
    private TrieNode root;
    private class TrieNode{
            Map<Character, TrieNode> hmap; 
            boolean endOfWord; 

            public TrieNode(){
                hmap = new HashMap<>();
                endOfWord = false;
            }
    }
        
    public void insert(String word) {
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char curr = word.charAt(i);
            
            TrieNode node = current.hmap.get(curr);
            if(node==null){
                node = new TrieNode();
                current.hmap.put(curr,node);
            }
            current = node;
        }
        current.endOfWord = true;   
    }   
    
    public boolean search(String word) {
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char curr = word.charAt(i);
            
            TrieNode node = current.hmap.get(curr);
            if(node==null){
                return false;
            }
            current = node;
        }
        return current.endOfWord; 
    }
 
    public String longestWord(String[] words) {
        root = new TrieNode();
        boolean srchAns=false;
        Arrays.sort(words, Collections.reverseOrder()); //sort words in desc order
        Arrays.sort(words, Comparator.comparingInt(String::length)); //sort words in asc order length wise
        
    
        for(String insWrd: words){
            insert(insWrd);
        }
        
        for(int i=words.length-1;i>=0;i--){ //take each word at a time
            int flag=1;
            for(int j=words[i].length()-1;j>0;j--){ //check each word if trie as a substring from 0 to len-1
                String currStr = words[i].substring(0,j);
                srchAns = search(currStr);
            
                if(srchAns == false){ //if not present then turn flag=0 & go for next word
                    flag=0;
                    break;
                }
            }
            if(flag==1){ //if present this is the word which is longest and lexicographically smallest
                return words[i];
            }
        }
        return "";
    }  
}