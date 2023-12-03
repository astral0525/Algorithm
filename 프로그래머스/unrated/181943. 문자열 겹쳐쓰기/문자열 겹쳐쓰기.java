class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        /* 틀린 풀이 :  이렇게 풀었을 시 aaaaaa , bbb, 3 -> aaabbb가 아닌 bbbaaa가 나와버림 
        answer = my_string.replace(
            my_string.substring(s,overwrite_string.length()+s), overwrite_string);
            */
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+overwrite_string.length());
        return answer;
    }
}