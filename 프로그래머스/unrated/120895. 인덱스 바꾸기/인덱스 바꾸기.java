class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String a, b ;
        a = "" + my_string.charAt(num1);
        b = "" + my_string.charAt(num2);
        answer = my_string.substring(0,num1) + b  + my_string.substring(num1+1, num2) + a + my_string.substring(num2+1);
        return answer;
    }
}