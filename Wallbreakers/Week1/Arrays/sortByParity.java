class Solution {
    public int[] sortArrayByParity(int[] A) {
       int start=0, end=A.length-1, temp=0;
       while(start<end){
           if(A[start]%2==0){
               start++;
           }
           else{
               temp=A[start];
               A[start]=A[end];
               A[end--]=temp;

           }
       }
       return A; 
    }
}