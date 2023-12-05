class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sa = ""+a;
        String sb = ""+b;
        answer = Integer.parseInt((sa+sb));
        
        if( answer >= (2*a*b)){
            return answer; 
        }else{
            return 2*a*b;
        }
        
    }
}