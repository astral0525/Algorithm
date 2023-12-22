class Solution {
    public String solution(int age) {
        
        String answer = "";
        while(age != 0){
            answer = (char)('a'+age%10) + answer;
            age = age/10;
        }
        return answer;
    }
}