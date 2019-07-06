class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> hset = new HashSet<>();
        char temp;
        for(String w: A){
            char[] tempW = w.toCharArray();
            for(int i=0;i<tempW.length-2;i++){
                for(int j=i+2;j<tempW.length;j=j+2){
                    if(tempW[i]>tempW[j]){
                        temp = tempW[i];
                        tempW[i] = tempW[j];
                        tempW[j] = temp;
                    }
                }
            }
            String str = new String(tempW);
            hset.add(str);
        }
        return hset.size();
    }
}