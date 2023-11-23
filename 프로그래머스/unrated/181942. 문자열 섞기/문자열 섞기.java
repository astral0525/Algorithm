class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int j=0,k=0; 
        for(int i=0; i<str1.length()+str2.length(); i++){
            if(i%2==0){
                answer += str1.charAt(k);
                k++;
            }
            else{
                answer += str2.charAt(j);
                j++;
            }
        }
        return answer;
    }
}