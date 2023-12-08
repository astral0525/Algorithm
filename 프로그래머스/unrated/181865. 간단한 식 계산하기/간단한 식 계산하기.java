class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] binomialBits = binomial.split(" ",3);
        int a = Integer.parseInt(binomialBits[0]);
        int b = Integer.parseInt(binomialBits[2]);
        char op = binomialBits[1].charAt(0);
        
        switch(op){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            default:
                return -1;
                
        }
        
        
    }
}