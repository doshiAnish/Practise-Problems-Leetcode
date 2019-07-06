class Solution {
    public List<String> subdomainVisits(String[] cpdomains) { 
        List<String> list = new ArrayList<>();
        Map<String, Integer> hmap = new HashMap<>();
        
        for(String s: cpdomains){
            String[] num = s.split("\\s");
            String[] url = num[1].split("\\.");
            int count = Integer.valueOf(num[0]);
            String ans = "";
            for(int j=url.length-1;j>=0;j--){
                ans = url[j]+"."+ans;
                
                if(!hmap.containsKey(ans)){
                    hmap.put(ans,count);    
                }
                else{
                    hmap.put(ans,count+hmap.get(ans));    
                }
            }
        }
        
        for(Map.Entry<String, Integer> m: hmap.entrySet()){
            list.add(m.getValue()+" "+m.getKey().substring(0,m.getKey().length()-1));
        }
        
        
        return list;
    }
}