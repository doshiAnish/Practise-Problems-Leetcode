class Solution {
    Set<Integer> hset = new HashSet<>();
    public boolean isHappy(int num) {
        
        
        while(hset.add(num)){
            int sum = 0;    
            
            
            while(num>0){
                int quo = num/10;
    
                int rem = num%10;
                
                sum = sum + (rem*rem);
                
                num = quo;
            }
            
            num = sum;
            
            if(num == 1){
                return true;
            }
        }
        
        return false;
    } 
    
}