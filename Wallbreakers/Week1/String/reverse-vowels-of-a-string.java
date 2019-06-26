class Solution {
    public String reverseVowels(String s) {
        int start=0, end=s.length()-1;
        char[] input = s.toCharArray();
        System.out.println(s);
        
        while(start<end){
            if(isVowel(input[start]) && isVowel(input[end])){
                char temp = input[start];
                input[start] = input[end];
                input[end] = temp;
                
                start++;
                end--;
            }
            else if(!isVowel(input[start])){
                start++;
            }
            else if(!isVowel(input[end])){
                end--;
            }
            
        }
        
        String answer = new String(input);
        
        return answer;
            
    }
    
    public boolean isVowel(char v){
        if(v =='a'||v =='e'||v =='i'||v =='o'||v =='u'||v =='A'||v =='E'||v =='I'||v =='O'||v =='U'){
           return true;
        }
        else {
            return false;
        }
        
    }
}
