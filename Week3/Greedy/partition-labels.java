class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ans = new ArrayList<>();
        int max=0, sum=0;
        ans.add(sum);
        
        for(int i=0;i<S.length();i++)
        { 
            if(i>max)
            { 
                sum = sum + ans.get(ans.size()-1);               
                ans.add(max-sum + 1);                
            }            
            max = Math.max(max, S.lastIndexOf(S.charAt(i)));        
        }
       
        sum = sum + ans.get(ans.size()-1);

        ans.add(S.length()-sum);
        
        ans.remove(0);
        
        return ans;
    }
}