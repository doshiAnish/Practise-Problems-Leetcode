class Solution {
    public int numJewelsInStones(String J, String S) {
        // int count = 0;
        // for(int i=0;i<S.length();i++){
        //     for(int j=0;j<J.length();j++){
        //       if(S.charAt(i)==J.charAt(j)){
        //         count = count + 1;
        //        }
        //         }
        //     }
        // return count;
        int count=0;
        Set<Character> hset = new HashSet<>();
        
        for(int i=0;i<J.length();i++){
                hset.add(J.charAt(i));
        }
        
        for(int i=0;i<S.length();i++){
            if(hset.contains(S.charAt(i)))
                count++;
        }
        
        
        return count;
        }
    }