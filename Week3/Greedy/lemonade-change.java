class Solution {
    public boolean lemonadeChange(int[] bills) {
        int giveback = 0;
        int n5=0, n10=0;
        int flag = 8;
        for(int i: bills){
            if(i==5) n5++;
            if(i==10) n10++;
            
            giveback = i-5;
            
            if(giveback==0) continue;
            
            else if(giveback==5){
              if(n5>0) n5--;
              else{
                flag=0;
                break;  
              } 
            
            }
            
            else if(giveback==15){
              if(n10>0){
                  if(n5>0){
                    n10--;
                    n5--;  
                  }
                  else{
                      flag=0;
                      break;
                  }
              }
              else if(n5>3){
                  n5 = n5-3;
              }  
              else{
                flag=0;
                break;  
              } 
            }
            
            else flag=1;    
        }
        
        if(flag==0) return false;
        else return true;
        
    }
}