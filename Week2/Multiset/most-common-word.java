class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String part1 = paragraph.replaceAll("\\p{P}", " ").toLowerCase(); //remove all punctuation and change everything to lower case
        String part2 = part1.replaceAll("\\s{2,}", " ").trim(); //change all double spaces with single: useful for last testcase
        String[]givenString =  part2.split(" "); //convert to array
        
        Map<String, Integer> hmap = new HashMap<>();
        Set<String> hset = new HashSet<>();
        
        for(String b: banned){
            hset.add(b);
        }
        
        for(String s: givenString){
            Integer val = hmap.get(s); 
            
            if(!hset.contains(s)){ //if not banned proceed for adding into hashmap
                if(!hmap.containsKey(s)){
                    hmap.put(s,1);
                }
                else{
                    hmap.put(s,++val);
                }    
            }
        }
        
        Integer max = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> m: hmap.entrySet()){
            max =  Math.max(m.getValue(),max); //get the max value from hashmap
        }
        for(Map.Entry<String, Integer> a: hmap.entrySet()){
            if(max==a.getValue())
                return a.getKey(); //return max value's key
        }
        return null;
    }
}